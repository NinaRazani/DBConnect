package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PersonService {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter name");
//        String n = sc.nextLine();
//        System.out.println("enter family");
//        String f = sc.nextLine();
//        System.out.println("enter id");
//        Scanner num = new Scanner(System.in);
//        int d = num.nextInt();

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection
                ("jdbc:sqlserver://localhost:1433;instanceName=WINDOWS10;database=java_DB;user=java;password=java123");
        Statement statement = connection.createStatement();
//        statement.executeUpdate("insert into person (ID , name , family) values ('" + d + "' , '" + n + "' , '" + f + "')");
//        statement.executeUpdate("insert into person (ID , name , family) values (4,'m','rr')");
//        statement.executeUpdate("delete from Person where family = 'sda'");
//        ResultSet resultSet = statement.executeQuery("select * from Person");
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString("name") + resultSet.getString("family"));
//        }
//        resultSet.close();
        statement.close();
        connection.close();
    }
}
