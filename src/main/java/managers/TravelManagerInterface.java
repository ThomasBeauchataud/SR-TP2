package managers;

import beans.Travel;

import java.util.Date;

public interface TravelManagerInterface {

    Travel[] findTravels (String departure, String destination, Date date);

}
