package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialCalculatorController {

    ImperialCalculator a = new ImperialCalculator();

    @RequestMapping("/centimeter")
    public double centimeter(@RequestParam double in) {
        return a.centimeter(in);
    }

    @RequestMapping("/meter")
    public double meter(@RequestParam double yd){
        return  a.meter(yd);
    }

}