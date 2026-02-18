package Factory;
interface Burger {
void prepearing();  
}
class SimpleBurger implements Burger{
    public void prepearing(){
        System.out.println("Prepare simple burger");
    }
} 
class StandardBurger implements Burger {
public void prepearing(){
    System.out.println("Prepare Standard burger");
}   
}

class PattyBurger implements Burger {
public void prepearing(){
    System.out.println("Prepare Patty burger");
}   
}

class BurgerFcatory{
public Burger createBurger(String type){
    if(type=="Simple"){
        return new SimpleBurger();
    }
    else if(type=="Standard"){
        return new StandardBurger();
    }
    else if(type=="Patty"){
        return new PattyBurger();
    }
    else{
        System.out.println("Invalid Burger");
        return null;
    }
}
}

public class SimpleFactory {
    public static void main(String[] args) {
        String type="Patty";
        BurgerFcatory bug=new BurgerFcatory();
        Burger bu=bug.createBurger(type);
        bu.prepearing();
    }
    
}
