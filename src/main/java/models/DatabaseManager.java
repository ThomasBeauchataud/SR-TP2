package models;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import java.sql.Connection;
import java.sql.DriverManager;

@ApplicationScoped
@Default
class DatabaseManager {

    private Connection connection;

    Connection getConnection() {
        if(connection != null) {
            return connection;
        }
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            Class.forName("models.SQLQuery");
            String db_url = "jdbc:mysql://localhost:3306/cas?autoReconnect=true&useSSL=false";
            String db_login = "root";
            String db_password = "0000";
            this.connection = DriverManager.getConnection(db_url, db_login, db_password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
