public class Generics1 {
    public static void main(String[] args) {
        Box<Integer>box=new Box();
        box.setvalue(5);
        System.out.println(box.getValue());

        // Pair<String,Integer>p=new Pair("Ayush",5);
        // System.out.println(p.getKey());
        // System.out.println(p.getValue());
    }
    
}
