package Learning.RedirectingInMVC;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/redir")
public class Redirecting {

    @RequestMapping("/login")
    public String form() {
        return "login";
    }

    @PostMapping("/submit")
    public String log(@RequestParam("username") String name,
                      @RequestParam("city") String city,
                      Model model) {

        model.addAttribute("name", name);
        model.addAttribute("city", city);

        if (name.equals("Rishikesh Chauhan") && city.equals("orai")) {
            return "redirect:/redir/dashboard";
        } else {
            return "login";
        }
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    //Spring MVC me tab use hota hai jab aap server se client ko bolte ho:
    //“Bhai, ab tu iss naye URL pe chala ja (HTTP redirect).”


    // There are 2 ways 2 handle redirection of page one is just simply write return "redirect:/targetpage"; and other is using
    //Using RedirectView object return new Redirect("/goHome");

}
