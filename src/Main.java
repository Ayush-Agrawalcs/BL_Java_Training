import java.sql.*;
import java.util.*;

public class Main {
    private static final String url="jdbc:mysql://localhost:3306/Student";
    private static final String name = "root";
    private static final String password="1234";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            Connection connection=DriverManager.getConnection(url,name,password);
            Statement statement=connection.createStatement();
            String querry1="select * from students";
            String querry=String.format("Insert INTO  students(name,age,marks) VALUES('%s','%o','%f')","Rahul",21,98.5 );
//           ResultSet result=statement.executeQuery(querry);
            int val=statement.executeUpdate(querry);
            ResultSet result=statement.executeQuery(querry1);
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
        }
        catch(SQLException e){
            System.out.println(e.getMessage());

        }
    }
}

