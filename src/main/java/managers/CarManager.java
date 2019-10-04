package managers;

import beans.Car;
import models.CarDaoInterface;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@ApplicationScoped
@Default
public class CarManager implements CarManagerInterface {

    @Inject
    private CarDaoInterface carDao;

    @Override
    public Car[] getCarsByUserName(String userName) {
        return new Car[0];
    }

    @Override
    public void createCar(Car car, String userName) {

    }

    @Override
    public void deleteCarByRegistration(String registration) {

    }

    @Override
    public boolean isOwner(String registration, String userName) {
        return false;
    }
}
