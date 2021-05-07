package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Service.CarService;
import javax.servlet.ServletRequest;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, ServletRequest servletRequest) {
        model.addAttribute("cars", CarService.getSomeCars(servletRequest));
        return "cars";
    }
}
