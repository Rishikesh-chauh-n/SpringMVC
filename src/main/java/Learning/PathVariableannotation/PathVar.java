package Learning.PathVariableannotation;


import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/pathvar")
public class PathVar {

    @RequestMapping("/page")
    public String pag(){
        return "page";
    }

    @RequestMapping("/image/{id}")
    public String page1(@PathVariable("id") int id, Model model){
        String message;
        switch(id){
            case 1: message = "This is a photo of a lion."; break;
            case 2: message = "This is a photo of a mountain."; break;
            case 3: message = "This is a photo of the ocean."; break;
            default: message = "No image found.";
        }
        model.addAttribute("photo",message);
        return "gallery";
    }
}
