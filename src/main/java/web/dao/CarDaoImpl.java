package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    List<Car> list = new ArrayList<>();

    {
        list.add(new Car(1, "Lada", "Granta"));
        list.add(new Car(2, "Lada", "Vesta"));
        list.add(new Car(3, "Nissan", "Qashqai"));
        list.add(new Car(4, "Toyota", "Camry"));
        list.add(new Car(5, "Opel", "Astra"));
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        return list.subList(0, count);
    }

    @Override
    public List<Car> getAllCars() {
        return list;
    }
}
