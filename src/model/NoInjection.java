package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class NoInjection {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter family");
        String f = sc.nextLine();
        System.out.println("enter id");
        Scanner num = new Scanner(System.in);
        String d = num.nextLine();

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection
                ("jdbc:sqlserver://localhost:1433;instanceName=WINDOWS10;database=java_DB;user=java;password=java123");

        //prevent sql injection
        PreparedStatement preparedStatement = connection.prepareStatement("select * from Person where id = ? and family = ?");
        preparedStatement.setString(1, d);
        preparedStatement.setString(2, f);
//        preparedStatement.setString(3,n);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id"));
            System.out.println(resultSet.getString("family"));
            System.out.println(resultSet.getString("name"));
        }
    }
}
