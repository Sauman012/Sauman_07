package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
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
    @Override
    public List<Cars> getCars(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
