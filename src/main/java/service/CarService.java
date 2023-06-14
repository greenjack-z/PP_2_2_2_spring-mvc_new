package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
public class CarService {
    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("bmw", "m5", (short) 530));
        carList.add(new Car("MB", "E63AMG", (short) 571));
        carList.add(new Car("Audi", "RS6", (short) 600));
        carList.add(new Car("Renault", "Clio RS", (short) 200));
        carList.add(new Car("Жигули", "От Дяди Васи", (short) 1000));
    }

    public List<Car> getCarsListByCount(int count) {
        try {
            return carList.subList(0, count);
        } catch (IndexOutOfBoundsException e) {
            return carList;
        }
    }
}
