/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.isil.webappjsp.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import pe.isil.webappjsp.user.dao.mysql.MysqlConnection;
import pe.isil.webappjsp.user.model.User;

/**
 *
 * @author joaqu
 */
public class UserDao {

    public int registerUser(User user) throws Exception{

        
            MysqlConnection mysqConn = new MysqlConnection();

            Connection conn = (Connection) mysqConn.getConnection();
            int rowAffected = 0;

            String queryInsert = "INSERT INTO USERS (name,lastname,username,pass,tipDoc, nroDoc, enable, email)" + "VALUES(?,?,?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(queryInsert);
            ps.setString(1, user.getName());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPass());
            ps.setString(5, user.getTipDoc());

            ps.setString(6, user.getNroDoc());
            ps.setInt(7, user.getEnable());
            ps.setString(8, user.getEmail());

            rowAffected = ps.executeUpdate();
            return rowAffected;

     
    }

    
    public int UpdateUser(User user) throws Exception{

        
            MysqlConnection mysqConn = new MysqlConnection();

            Connection conn = (Connection) mysqConn.getConnection();
            int rowAffected = 0;

            String queryInsert = "UPDATE USERS set name=?,lastname=?,username=?,pass=?,enable=?, email=? where nroDoC=" + user.getNroDoc();

            PreparedStatement ps = conn.prepareStatement(queryInsert);
            ps.setString(1, user.getName());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPass());         
            ps.setInt(5, user.getEnable());
            ps.setString(6, user.getEmail());

            rowAffected = ps.executeUpdate();
            return rowAffected;

     
    }
    
    
    public boolean validateUser(User user) throws Exception{

        
            MysqlConnection mysqConn = new MysqlConnection();

            Connection conn = (Connection) mysqConn.getConnection();
            int rowAffected = 0;

            String queryValidate = "SELECT * FROM USERS where nroDoC=" + user.getNroDoc();

            Statement ps = conn.createStatement();
            ResultSet resultset =  ps.executeQuery(queryValidate);
            
            while(resultset.next()){
             return true;
            }
            
            return false;
            
            }

            

     
    

}
