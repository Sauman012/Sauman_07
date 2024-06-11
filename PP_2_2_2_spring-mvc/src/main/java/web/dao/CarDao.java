package web.dao;

import web.models.Cars;

import java.util.List;

public interface CarDao {
    List<Cars> getCars(int count);
}
