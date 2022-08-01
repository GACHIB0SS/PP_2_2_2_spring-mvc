
package web.service;

import web.model.Car;

import java.util.*;

public interface CarService {
    List<Car> getAllCars();
    List<Car> getSomeCars(int count);
}
