package Factory;

interface Burger1 {
void prepearing();  
}
class SimpleBurger1 implements Burger1{
    public void prepearing(){
        System.out.println("Prepare simple burger");
    }
} 
class StandardBurger1 implements Burger1 {
public void prepearing(){
    System.out.println("Prepare Standard burger");
}   
}

class PattyBurger1 implements Burger1 {
public void prepearing(){
    System.out.println("Prepare Patty burger");
}   
}
class WheatSimpledBurger1 implements Burger1 {
public void prepearing(){
    System.out.println("Prepare wheat simple burger");
}   
}
class WheatStandardBurger1 implements Burger1 {
public void prepearing(){
    System.out.println("Prepare wheat Standard burger");
}   
}
class WheatPattyBurger1 implements Burger1 {
public void prepearing(){
    System.out.println("Prepare wheat Patty burger");
}   
}

 interface BurgerFcatory1 {
    Burger1 createBurger(String type);
} 

class BurgerKing implements BurgerFcatory1 {
    public Burger1 createBurger(String type){
        if(type=="Standard"){
            return new StandardBurger1();
        }
        else if(type=="Simple"){
            return new SimpleBurger1();
        }
        else if(type=="Patty"){
            return new PattyBurger1();
        }
        else{
            System.out.println("Invalid burger");
            return null;
        }
    }
    
}
class BurgerVeg implements BurgerFcatory1 {
    public Burger1 createBurger(String type){
            if(type=="simpleWheat"){
            return new WheatStandardBurger1();
        }
        else if(type=="standardWheat"){
            return new WheatStandardBurger1();
        }
        else if(type=="PattyWheat"){
            return new WheatPattyBurger1();
        }

        else{
            System.out.println("Invalid burger");
            return null;
        }
    }
    
}

public class MethodFcatory {
    public static void main(String[] args) {
        String type="PattyWheat";
        BurgerFcatory1 bug=new BurgerVeg();
        Burger1 bu=bug.createBurger(type);
        bu.prepearing();
    }
    
}
