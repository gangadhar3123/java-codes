//import java.util.Arrays;
//
//class Books {
//    int year;
//    String book_name;
//
//    Books(int year, String book) {
//        this.year = year;
//        this.book_name = book;
//    }
//
// String displyinfo (){
//        return book_name + " " + year;
//    }
//
//}
//
//class Library{
//    int year;
//    String Name;
//    Books[] books;
//    Library(int y ,String na,Books[] books){
//        this.year=y;
//        this.Name=na;
//        this.books=books;
//
//    }
//    void Display(){
//        System.out.println("this is libaray : "+Name);
//        System.out.println("this is year "+year);
//        System.out.println("these are books ");
//        for(Books bo:books){
//
//            System.out.println(bo.displyinfo());
//        }
//
//    }
//}
//
//
//
//
//public class Aggregation {
//    public static void main(String []args){
//        Books b=new Books(23,"sqwdwwew");
//        Books b2=new Books(353,"juewuhr");
//
//        Books book[]={b,b2};
//        Library l=new Library(232,"ramastros",book);
//        l.Display();
//    }
//}




        class Engine{
            String type;
            Engine(String type){
                this.type=type;
            }
        }

        class Model{
            int year;
            String carname;
            Engine engine;
            Model(int y,String car,String engine){
                this.year=y;
                this.carname=car;
                this.engine=new Engine(engine);

            }

            void Display(){
                System.out.println(year);
                System.out.println(carname);
                System.out.println(engine.type);


            }

        }

public  class composition {
    public static void main(String []args){
Model m=new Model(2323,"ferrai","v44");
m.Display();
    }
}

