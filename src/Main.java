import dao.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        StudentDAO sdao=new StudentDAO();
        CourseDAO cdao=new CourseDAO();
        EnrollmentDAO edao=new EnrollmentDAO();

        while(true){

            System.out.println("\n1.Add Student");
            System.out.println("2.Add Course");
            System.out.println("3.Register Student");
            System.out.println("4.Exit");

            int ch=sc.nextInt();
            sc.nextLine();

            switch(ch){

                case 1:
                    System.out.print("Name:");
                    String name=sc.nextLine();

                    System.out.print("Email:");
                    String email=sc.nextLine();

                    sdao.addStudent(name,email);
                    break;

                case 2:
                    System.out.print("Course:");
                    String cname=sc.nextLine();

                    System.out.print("Instructor:");
                    String ins=sc.nextLine();

                    cdao.addCourse(cname,ins);
                    break;

                case 3:
                    System.out.print("Student ID:");
                    int sid=sc.nextInt();

                    System.out.print("Course ID:");
                    int cid=sc.nextInt();

                    edao.enrollStudent(sid,cid);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
