package managers;

import beans.Travel;
import models.TravelDaoInterface;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.Date;

@ApplicationScoped
@Default
public class TravelManager implements TravelManagerInterface {

    @Inject
    private TravelDaoInterface travelDao;

    @Override
    public Travel[] findTravels(String departure, String destination, Date date) {
        return new Travel[0];
    }
}
