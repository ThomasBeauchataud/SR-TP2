package models;

import beans.Travel;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

@ApplicationScoped
@Default
public class TravelDao implements TravelDaoInterface {

    @Override
    public void insert(Travel object) {

    }

    @Override
    public void update(Travel object) {

    }

    @Override
    public Travel getById(int id) {
        return null;
    }

    @Override
    public Travel getByName(String name) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByName(String name) {

    }

}
