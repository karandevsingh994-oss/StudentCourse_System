package dao;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void addStudent(String name,String email){

        try{
            Connection con= DBConnection.getConnection();

            String sql="INSERT INTO student(name,email) VALUES(?,?)";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,name);
            ps.setString(2,email);

            ps.executeUpdate();

            System.out.println("Student Added");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

