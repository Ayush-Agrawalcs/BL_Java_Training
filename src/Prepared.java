import java.sql.*;
import java.util.Scanner;

public class Prepared {
    private static final String url="jdbc:mysql://localhost:3306/Student";
    private static final String name = "root";
    private static final String password="1234";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Connection connection = DriverManager.getConnection(url, name, password);
            String querry="Insert INTO  students(name,age,marks) VALUES(?,?,?)";
            PreparedStatement state=connection.prepareStatement(querry);
            state.setString(1,"Naman");
            state.setInt(2,25);
            state.setDouble(3,36.5);
            int val=state.executeUpdate();
            String querry1="select * from students";
            PreparedStatement state1=connection.prepareStatement(querry1);
            ResultSet result=state1.executeQuery();
            System.out.printf("---------------------------\n");
            System.out.printf("|%-5s%-10s%-5s%-5s|\n","id","name","age","marks");
            System.out.printf("---------------------------\n");
            while(result.next()){
                int id=result.getInt("id");
                String name=result.getString("name");
                int age=result.getInt("age");
                double marks=result.getDouble("marks");
                System.out.printf("|%-5s%-10s%-5s%-5s|\n",id,name,age,marks);


            }
            System.out.printf("---------------------------\n");

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
