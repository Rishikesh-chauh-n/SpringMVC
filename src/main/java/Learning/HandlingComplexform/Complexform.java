package Learning.HandlingComplexform;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/comp")
public class Complexform {

    @GetMapping("/form")
    public ModelAndView showForm() {
        ModelAndView mv = new ModelAndView("complexform");
        mv.addObject("user", new User());
        return mv;
    }

    @PostMapping("/submit")
    public ModelAndView handleForm(@ModelAttribute User user) {
        ModelAndView mv = new ModelAndView("result");
        mv.addObject("user", user);
        return mv;
    }


    //Jab bhi complex form banate hai to classes mai data store karwate hai taki wo data bind ho jaye aur ModelAttribute ka use karke get kar sake
    //ye sab binding wagera apne aap spring backend  par handle karta hai.
}

