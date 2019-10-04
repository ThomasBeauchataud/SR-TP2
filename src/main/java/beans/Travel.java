package beans;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class Travel implements Serializable {

    private int id;
    private String departure;
    private String destination;
    private Frequency frequency;
    private Date date;
    private Time time;
    private Car car;

    public Travel(String departure, String destination, Frequency frequency, Date date, Time time) {
        this.departure = departure;
        this.destination = destination;
        this.frequency = frequency;
        this.date = date;
        this.time = time;
    }

    public Travel(int id, String departure, String destination, Frequency frequency, Date date, Time time) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        this.frequency = frequency;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }
}
