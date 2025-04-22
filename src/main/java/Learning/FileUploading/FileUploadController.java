package Learning.FileUploading;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/upl")
public class FileUploadController {

    private static final String UPLOAD_DIR = "C:/uploads"; // Change as needed

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String showUploadForm() {
        return "upload";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
        if (!file.isEmpty()) {
            try {
                // 1. Save file to disk
                String filePath = UPLOAD_DIR + File.separator + file.getOriginalFilename();
                File dest = new File(filePath);
                dest.getParentFile().mkdirs(); // ensure folders exist
                file.transferTo(dest);

                // 2. Save info to database
                UploadedFile uploadedFile = new UploadedFile(file.getOriginalFilename(), filePath);
                new FileDAO().saveFile(uploadedFile);

                model.addAttribute("message", "File uploaded successfully!");
                model.addAttribute("fileName", uploadedFile.getFileName());
                model.addAttribute("filePath", uploadedFile.getFilePath());

                return "show";

            } catch (IOException e) {
                e.printStackTrace();
                model.addAttribute("message", "Upload failed: " + e.getMessage());
            }
        } else {
            model.addAttribute("message", "Please select a file to upload.");
        }
        return "upload";
    }
}

