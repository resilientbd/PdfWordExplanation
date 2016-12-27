/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;
import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Faisal
 */
public class db_functions {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Statement stmt;
    
    public void connection()
    {
        try{
           Class.forName("org.sqlite.JDBC");
           con=DriverManager.getConnection("jdbc:sqlite:EngToBanglaDictonary.sqlite");
           
           
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public String search_result(String words)
    {
        String query = "SELECT definations FROM dictonary WHERE words='"+words+"'";
        String result =null;
        
        try{
          stmt=con.createStatement();  
          pst=con.prepareStatement(query);
          rs=pst.executeQuery();
          int i=0;
          while (rs.next())
          {
              result=rs.getString(1);
              i++;
          }
          
          return result;
        }catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, "Query not executed ", "Error!!", JOptionPane.PLAIN_MESSAGE);
             return null;
        }
        
        
       
    }
    
}
