package Learning.useOfstaticfile;


import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/static")
public class StaticFile {

    @RequestMapping("/file")
    public String file(){
        return "staticfile";
    }


}
