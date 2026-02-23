package Observer;
import java.util.*;
 interface Isubscribe {
    void update();
}
interface Ichannel {
    void Subscriber(Isubscribe sub);
    void UnSubscriber(Isubscribe sub);
    void noteify();
}
class Channel implements Ichannel{
    List<Isubscribe>list=new ArrayList<>();
    String name;
    String latestVideo;
    Channel(String name){
        this.name=name;
    }
    // Add subscriber
    public void Subscriber(Isubscribe sub){
        if(!list.contains(sub)){
            list.add(sub);
        }
    }
     public void UnSubscriber(Isubscribe sub){
        if(list.contains(sub)){
            list.remove(sub);
        }
    }
    public void noteify(){
        for(Isubscribe sub:list){
            sub.update();
        }
    }

    public void uplodvideo(String title){
        latestVideo=title;
        System.out.println(name + " uploded "+ title);
        noteify();
    }

    public String getVideo(){
        return "Checkout our new Video:"+latestVideo;
    }

}

class Subscriber implements Isubscribe{
    String name;
    Channel ch;
    Subscriber(String name,Channel ch){
        this.name=name;
        this.ch=ch;
    }
    public void update() {
        System.out.println("Hey "+name +" , "+this.ch.getVideo());    
    }
}

public class Observable {
    public static void main(String[] args) {
        Channel ch=new Channel("Coder Army");

        Subscriber sb=new Subscriber("Ayush", ch);
        Subscriber sb1=new Subscriber("Sneha", ch);

        ch.Subscriber(sb);
        ch.Subscriber(sb1);
        ch.uplodvideo("Observer pattern tutorial");

        ch.UnSubscriber(sb1);
        ch.uplodvideo("Decorator Pattern tutorial");
    }
    
}
   