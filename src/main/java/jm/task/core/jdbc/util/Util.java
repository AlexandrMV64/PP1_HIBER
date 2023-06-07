package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection dbConnection;
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/";
    private static final String DATABASE = "postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "root";

    public static Connection getJDBSConnection(){
        while (dbConnection == null) {

            try {
                Class.forName(DRIVER);
                System.out.println("Драйвер успешно загружен");
            } catch (ClassNotFoundException e) {
                System.out.println("Не удалось загрузить драйвер");
                break;
            }
            try {
                dbConnection = DriverManager.getConnection(
                        URL + DATABASE, USERNAME, PASSWORD);
                System.out.println("Успешное подлючение к БД");
            } catch (SQLException e) {
                System.out.println("Не удалось подключиться к БД");
                break;
            }
        }
        return dbConnection;
    }



    // реализуйте настройку соеденения с БД
}
