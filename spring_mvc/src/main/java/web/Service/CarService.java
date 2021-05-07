package web.Service;

import web.model.Car;

import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getSomeCars(ServletRequest servletRequest) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw","X5",50000));
        cars.add(new Car("mercedes","GLE",60000));
        cars.add(new Car("lada","largus",10000));
        cars.add(new Car("nissan","almera",20000));
        cars.add(new Car("toyota","camry",30000));
        int count = Integer.parseInt(servletRequest.getParameter("count"));
        return count <5 ? cars.subList(0, count) : cars;
    }
}
