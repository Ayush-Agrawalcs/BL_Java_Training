
import java.util.ArrayList;

class Products{
    String name;
    double price;
    Products(String name, double price){
        this.name=name;
        this.price=price;
    }
}

class Shoppingcarts{
    private ArrayList<Product>list=new ArrayList<>();

    public void addproduct(Product p){
        list.add(p);
    }

    public ArrayList<Product> getProduct(){
        return list;
    }

    double calculate(){
        double total=0;
        for(int i=0;i<list.size();i++){
            total+=list.get(i).price;
        }
        return total;
    }



    // voilate the single principal voilate principle
//    void print(){
//        System.out.println("Shopping cart");
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i).name+"- $ "+list.get(i).price);
//        }
//    }



    // voilate the single principal voilate principle
//    void save(){
//        System.out.println("saving shopping cart to database");
//    }
}

// so we solve this problem by seperation a class for every diffrent work
class Shoppingprinters{
    private Shoppingcarts cart;
    Shoppingprinters(Shoppingcarts cart){
        this.cart=cart;
    }
    void print(){
        for(int i=0;i<cart.getProduct().size();i++){
            System.out.println(cart.getProduct().get(i).name+"->"+cart.getProduct().get(i).price);
        }
    }
}


// so we solve this problem by seperation a class for every diffrent work
class Shoppingdbs{
    private Shoppingcarts cart;
    void save(){
        System.out.println("saving shopping cart to database");
    }
    // Voilate open-close principle
//    void saveToSQl(){
//        System.out.println("Svaing yo SQL");
//    }
//    // voilate open-close principle
//    void savetomongo(){
//        System.out.println("Saving to mongo");
//    }
//    // voilate open-close principle
//    void savetofile(){
//        System.out.println("Saving to file");
//    }
}

abstract class Persistence{
    private Shoppingcarts cart;
    abstract public void Save();
}

class Savetomongo extends Persistence{
    public void Save(){
        System.out.println("save to moongo");
    }
}
class Savetomfile extends Persistence{
    public void Save(){
        System.out.println("save to file");
    }
}
class Savetosql extends Persistence{
    public void Save(){
        System.out.println("save to sql");
    }
}


public class SecondJava {
    public static void main(String[] args) {
        Shoppingcarts cart=new Shoppingcarts();
        cart.addproduct(new Product("Laptop",1500));
        cart.addproduct(new Product("Mouse",50));
        Shoppingprinters sp=new Shoppingprinters(cart);
        sp.print();
        System.out.println("Total-> "+cart.calculate());
//        Shoppingdbs sp1=new Shoppingdbs();
//        sp1.save();
        Persistence p=new Savetomongo();
        p.Save();
    }
}


