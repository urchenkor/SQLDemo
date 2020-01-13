package sql.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockExchange {
    public static final String DB_URL = "jdbc:h2:/c:/Users/роман/Desktop/SQLDemo/db/stockExchange";
    public static final String DB_Driver = "org.h2.Driver";

    public static void main(String[] args) {
        try {
            Class.forName(DB_Driver);
            Connection connection = DriverManager.getConnection(DB_URL);
            System.out.println("Соединение с СУБД выполнено");
            connection.close();
            System.out.println("Отключение от СУБД выполнено");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC драйвер для СУБД не найден");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL");
        }
    }
}
