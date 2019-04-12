package app.web.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProcessNumberController {
    @GetMapping("/process")
    public String process(@RequestParam(name = "inputNumber", required = true, defaultValue = "0") int inputNumber, Model model) {
        model.addAttribute("inputNumber", inputNumber);
        return "views/view-process";
    }
}
