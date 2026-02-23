package Decorator;
  
interface Character{
    String getabilites();

}
class Mario implements Character{
    public String getabilites(){
        return "Mario";
    }
}

abstract class Characters implements Character {
Character ch;
Characters(Character ch){
    this.ch=ch;
}
 public String getabilites() {
        return ch.getabilites();
    }
}

class HeightUp extends Characters{
    HeightUp(Character c){
        super(c);
    }
    public String getabilites(){
        return ch.getabilites()+" with Heightup";
    }

}
class GunPowerUp extends Characters{
    GunPowerUp(Character c){
        super(c);
    }
    public String getabilites(){
        return ch.getabilites()+" with GunPowerup";
    }

}
class StartPowerUp extends Characters{
   StartPowerUp(Character c){
        super(c);
    }
    public String getabilites(){
        return ch.getabilites()+" with StartPowerUp";
    }

}
 
public class Decorator {
    public static void main(String[] args) {
        Character mario=new Mario();
        System.out.println("Basic Character "+mario.getabilites());

        mario=new HeightUp(mario);
        System.out.println("After Heightup "+mario.getabilites());
        
        mario=new GunPowerUp(mario);
        System.out.println("Agter gunPower "+mario.getabilites());

        mario=new StartPowerUp(mario);
        System.out.println("After StartPower up "+mario.getabilites());
    }
}
