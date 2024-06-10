package web.dao;

import org.springframework.stereotype.Component;
import web.models.Cars;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Cars> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Cars("AUDI", "100", 1990));
        cars.add(new Cars("BMW", "5", 1995));
        cars.add(new Cars("FORD", "FOCUS", 2012));
        cars.add(new Cars("HAVAL", "F7x", 2021));
        cars.add(new Cars("LADA", "ISKRA", 2024));
    }
    public List<Cars> getCars() {
        return cars;
    }
}
