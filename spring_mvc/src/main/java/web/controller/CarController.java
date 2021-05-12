package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.serv.*;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public static String getCars(@RequestParam(defaultValue = "6") int count, ModelMap model) {
        model.addAttribute("cars", CarService.getSomeCars(count));
        return "cars";
    }
}
