package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();

    }

    @Override
    public List<Car> getCountCars(Integer count) {
        if (count != null && count < 5 && count > 0) {
            return carDao.getCountCars(count);
        }
        else {
            return carDao.getAllCars();
        }
    }
}