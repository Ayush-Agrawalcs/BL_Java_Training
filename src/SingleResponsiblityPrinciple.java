import java.util.ArrayList;

class Product{
    String name;
    double price;
    Product(String name, double price){
        this.name=name;
        this.price=price;
    }
}

class Shoppingcart{
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
class Shoppingprinter{
    private Shoppingcart cart;
    Shoppingprinter(Shoppingcart cart){
        this.cart=cart;
    }
    void print(){
        for(int i=0;i<cart.getProduct().size();i++){
            System.out.println(cart.getProduct().get(i).name+"->"+cart.getProduct().get(i).price);
        }
    }
}


// so we solve this problem by seperation a class for every diffrent work
class Shoppingdb{
    private Shoppingcart cart;
    void save(){
        System.out.println("saving shopping cart to database");
    }
}


public class SingleResponsiblityPrinciple {
    public static void main(String[] args) {
        Shoppingcart cart=new Shoppingcart();
        cart.addproduct(new Product("Laptop",1500));
        cart.addproduct(new Product("Mouse",50));
        Shoppingprinter sp=new Shoppingprinter(cart);
        sp.print();
        System.out.println("Total-> "+cart.calculate());
        Shoppingdb sp1=new Shoppingdb();
        sp1.save();
    }
}
