package Learning.ControllerTOview.DataPassing;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/ctv")
public class ConrollerToView {

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("msg","Hi we are learning how to pass data from controller to view");
        return "ControlToView";
    }



    @GetMapping("/show1")
    public ModelAndView show1(){
        ModelAndView mv = new ModelAndView("ControlToView1");
        mv.addObject("msg","Here we are learning that how to send data from controller to view by the help of ModelAndView ");
        return mv;
    }



}
