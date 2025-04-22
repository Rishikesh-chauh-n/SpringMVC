package Learning.ViewTOcontroller.DataPassing;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/vtc")
public class ViewToController {

    @RequestMapping("/form")
    public String form(){
        return "form";
    }
    @PostMapping("/submit")
    public String formHandler(@RequestParam("username") String name, @RequestParam("city") String city,Model model){
        model.addAttribute("name",name);
        model.addAttribute("city",city);
         return "viewtocontrol";
    }


    //Now we will learn with ModelAttribute which binds the data to any class this is done by spring itself.

    @RequestMapping("/form1")
    public String form1doing(Model model){
        model.addAttribute("user", new User());
        return "form1";
    }


    @PostMapping("/register")
    public ModelAndView handlingwithModelAttribute(@ModelAttribute User user){
        ModelAndView mv = new ModelAndView("success");
        mv.addObject("user",user);
        return mv;
    }
}
