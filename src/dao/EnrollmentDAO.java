package dao;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnrollmentDAO {

    public void enrollStudent(int sid,int cid){

        try{
            Connection con=DBConnection.getConnection();

            String sql="INSERT INTO enrollment(student_id,course_id) VALUES(?,?)";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setInt(1,sid);
            ps.setInt(2,cid);

            ps.executeUpdate();

            System.out.println("Enrollment Successful");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

