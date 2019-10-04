package managers;

import beans.Car;

public interface CarManagerInterface {

    Car[] getCarsByUserName(String userName);

    void createCar(Car car, String userName);

    void deleteCarByRegistration(String registration);

    boolean isOwner(String registration, String userName);

}
