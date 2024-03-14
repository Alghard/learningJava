/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours07;

import java.sql.*;

/**
 *
 * @author Mat
 */
public class CatchSQLExc
{
    
    private static String URL = "jdbc:mysql://localhost:3306/gsbv2";
    private static String LOGIN = "root";
    private static String PASSWORD = "";
    
public static void main(String[] args)
{
    try
    {
	Connection conn = DriverManager.getConnection(URL, LOGIN, PASSWORD);
	// unreported exception SQLException; must be caught or declared to be thrown	    
	conn.close();
    }
    catch (SQLException exc)
    {
	exc.printStackTrace();
    }
    
    System.out.println("Suite du programme...");	
}        
}
