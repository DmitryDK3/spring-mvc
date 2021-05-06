package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Car;

import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;
@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, ServletRequest servletRequest) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw","X5",50000));
        cars.add(new Car("mercedes","GLE",60000));
        cars.add(new Car("lada","largus",10000));
        cars.add(new Car("nissan","almera",20000));
        cars.add(new Car("toyota","camry",30000));
        int count = Integer.parseInt(servletRequest.getParameter("count"));

        model.addAttribute("cars", count <5 ? cars.subList(0, count) : cars);
        return "cars";
    }
}
