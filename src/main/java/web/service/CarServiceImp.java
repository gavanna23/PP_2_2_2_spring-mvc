package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
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
@Override
    public List<Car> getCarsByCount(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
