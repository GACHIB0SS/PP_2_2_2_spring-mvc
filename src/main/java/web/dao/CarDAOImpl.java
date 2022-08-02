package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>(5);

        cars.add(new Car("Audi", "A6", 2006));
        cars.add(new Car("BMW", "M5", 2005));
        cars.add(new Car("Mercedes Benz", "W213", 2013));
        cars.add(new Car("Honda", "Accord", 2010));
        cars.add(new Car("Toyota", "Camry", 2009));

    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getSomeCars (int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}