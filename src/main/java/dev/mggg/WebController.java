package dev.mggg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Controller
public class WebController {
    @GetMapping("/greeting")
    public String homepage()
    {
        System.out.println("testing");
        return "homepage";
    }
}
