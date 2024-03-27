package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private static int cars_caunt;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++cars_caunt, "Mazda", 111));
        cars.add(new Car(++cars_caunt, "Toyota", 222));
        cars.add(new Car(++cars_caunt, "Honda", 333));
        cars.add(new Car(++cars_caunt, "Lada", 444));
        cars.add(new Car(++cars_caunt, "Nissan", 555));
    }

    public List<Car> count(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
