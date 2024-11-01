package com.makers.makersbnb_coach_support_code;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PlanetsController {
    // tell Spring Boot this method handles the 'GET "/"' request
    @GetMapping("/")
    public ModelAndView planetsList() {
        return new ModelAndView("/PlanetsList");
    }
}
