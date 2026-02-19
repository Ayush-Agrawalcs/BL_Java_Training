
interface Database{
    void save(String data);
}
class MySql implements Database{
    public void save(String user){
        System.out.println(user+" saved in sql database");
    }
}
class Mongodb implements Database{
    public void save(String user){
        System.out.println(user+" saved in Mongodb database");
    }
}

class UserService{
   Database data;

   UserService(Database sb) {
       this.data = sb;
   }
   public void stored(String da){
       data.save(da);
   }
}
public class DependencyInversion {
    public static void main(String[] args) {
        Mongodb mg=new Mongodb();
        MySql my=new MySql();
        UserService us=new UserService(mg);
        us.stored("Ayush");
        UserService usd=new UserService(my);
        usd.stored("Aman");
    }
}
