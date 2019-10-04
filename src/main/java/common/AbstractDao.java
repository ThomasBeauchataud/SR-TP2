package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class AbstractDao {

    private final String db_url = "jdbc:mysql://localhost:3306/cas";
    private final String db_login = "root";
    private final String db_password = "0000";

    public AbstractDao() {
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    protected void executeInsertQuery(String query) {
        log(query);
        try {
            Connection connection = DriverManager.getConnection(this.db_url, this.db_login, this.db_password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected ResultSet executeSelectQuery(String query) {
        log(query);
        ResultSet resultSet = null;
        try {
            Connection connection = DriverManager.getConnection(this.db_url, this.db_login, this.db_password);
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultSet;
    }

    protected void executeUpdateQuery(String query) {
        this.executeInsertQuery(query);
    }

    protected void executeDeleteQuery(String query) {
        this.executeInsertQuery(query);
    }

    protected void log(String message) {
        Logger.log("dao", message);
    }

}
