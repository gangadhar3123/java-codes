
class car{
    String color;
    String name;
    car(String c,String n){
        this.color=c;
        this.name=n;

    }
    public  String toString(){
        return "name "+name+" "+"color "+color;
    }
}








public class toString {
    public static void main(String[]args ){
        car c=new car("Blue" ,"Ferari");
        System.out.println(c.toString());

    }
}
