package org.iesalixar.daw2.NataliaFernandez.SuscripTrack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {


    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }
}
