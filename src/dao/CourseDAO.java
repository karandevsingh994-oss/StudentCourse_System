package dao;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CourseDAO {

    public void addCourse(String cname,String instructor){

        try{
            Connection con=DBConnection.getConnection();

            String sql="INSERT INTO course(course_name,instructor) VALUES(?,?)";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,cname);
            ps.setString(2,instructor);

            ps.executeUpdate();

            System.out.println("Course Added");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
