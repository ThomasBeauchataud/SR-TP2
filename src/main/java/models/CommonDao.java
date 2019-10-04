package models;

import common.Logger;

import javax.inject.Inject;

abstract class CommonDao {

    @Inject
    protected DatabaseManager databaseManager;

    void log(String message) {
        Logger.log("dao", message);
    }

}
