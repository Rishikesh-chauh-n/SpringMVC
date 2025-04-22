package Learning.HandlingErrorinComplexform;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/er")
public class LoginController {

    @GetMapping("/login1")
    public String showLoginForm(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login1"; // The view name (login.jsp)
    }

    @PostMapping("/log")
    public String submitLoginForm(@Valid LoginForm loginForm, BindingResult bindingResult, Model model) {
        // If there are validation errors, return to the form with errors
        if (bindingResult.hasErrors()) {
            return "login1"; // Returning to the login form with errors
        }

        // Business logic: validate user login (for demonstration purposes)
        if ("admin".equals(loginForm.getUsername()) && "admin123".equals(loginForm.getPassword())) {
            model.addAttribute("message", "Login successful!");
            return "welcome"; // Redirect to welcome page
        } else {
            model.addAttribute("errorMessage", "Invalid username or password.");
            return "login1"; // Return to login page with error message
        }
    }
}

