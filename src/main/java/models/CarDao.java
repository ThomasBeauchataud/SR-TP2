package models;

import beans.Car;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

@ApplicationScoped
@Default
public class CarDao implements CarDaoInterface {

    @Override
    public void insert(Car object) {

    }

    @Override
    public void update(Car object) {

    }

    @Override
    public Car getById(int id) {
        return null;
    }

    @Override
    public Car getByName(String name) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByName(String name) {

    }

}
