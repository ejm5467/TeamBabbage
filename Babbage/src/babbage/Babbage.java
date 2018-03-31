/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babbage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author Emily
 */
public class Babbage {

    static final String DB_URL = 
            "jdbc:mysql://istdata.bk.psu.edu:3306/ejm5467"; 
    static final String DB_USER = "ejm5467";           
    static final String DB_PASSWD = "berks8221";  
    
    public static void main(String[] args) {
        Connection connection = null;  
        Statement statement = null;
        ResultSet resultSet = null; 
        
        try {
           
            connection= DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM Movies");
            
            ResultSetMetaData md = resultSet.getMetaData();
            System.out.printf("%s\t%s\t\n", 
                    md.getColumnName(1), 
                    md.getColumnName(2));
            
            while(resultSet.next()){
                System.out.printf("%d\t%s\n", 
                        resultSet.getInt(1), 
                        resultSet.getString(2));
            }
            
            resultSet=statement.executeQuery("SELECT * FROM Users");
           
            md = resultSet.getMetaData();
            System.out.printf("%s\t%s\t%s\t\n", 
                    md.getColumnName(1), 
                    md.getColumnName(2), 
                    md.getColumnName(3));
            
            /* Loop through the results and print each record to the screen */
            while(resultSet.next()){
                /* Output the row, with formatting... */
                System.out.printf("%d\t%s\t\t%s\n", 
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getString(3));
            }
            
            resultSet=statement.executeQuery("SELECT * FROM TicketsSold");
            
            md = resultSet.getMetaData();
            System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t\n", 
                    md.getColumnName(1), 
                    md.getColumnName(2), 
                    md.getColumnName(3),
                    md.getColumnName(4),
                    md.getColumnName(5),
                    md.getColumnName(6));
            
            /* Loop through the results and print each record to the screen */
            while(resultSet.next()){
                /* Output the row, with formatting... */
                System.out.printf("%d\t\t%s\t%d\t\t%tD\t%tl:%tM%tp\t\t%f\t\n", 
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getInt(3),
                        resultSet.getDate(4),
                        resultSet.getTime(5),
                        resultSet.getTime(5),
                        resultSet.getTime(5),
                        resultSet.getDouble(6));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
