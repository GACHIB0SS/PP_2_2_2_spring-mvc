package web.service;


import web.models.Car;

import java.util.List;


public class CarService {


    public static    List<Car> getCountCar(List<Car> carList, int count) {
        return carList.stream().limit(count).toList();
    }




}
