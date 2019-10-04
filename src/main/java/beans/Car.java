package beans;

public class Car {

    private int id;
    private int places;
    private String registration;

    public Car(int places, String registration) {
        this.places = places;
        this.registration = registration;
    }

    public Car(int id, int places) {
        this.id = id;
        this.places = places;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

}
