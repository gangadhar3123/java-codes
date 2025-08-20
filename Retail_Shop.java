import java.util.Scanner;

class Retail_shop_name{
        String Name;
//        int Age;
       String Product_name;
        int Product_Price;
        Retail_shop_name(String name,int price_of_product,String pro_name){
            this.Name=name;
//            this.Age=age;
            this.Product_name=pro_name;
            this.Product_Price=price_of_product;

        }
        void Display(){
            System.out.println("*********************************");
            System.out.println("The Retail Shop Name  : "+Name);
            System.out.println("The Product Name :"+Product_name);
            System.out.println("The Product Price : "+Product_Price);

        }
    }

    class Product_Cal extends Retail_shop_name{
        int Quantity;

        Product_Cal(String name,int price,String product_name,int quan){
            super(name,price,product_name);
            this.Quantity=quan;
        }
        void Product_cal(){
            System.out.println("The Product Quantity :"+Quantity);
            int total_price=Product_Price*Quantity;
            System.out.println("The Total Price : "+total_price);
            System.out.println("*********************************");
        }

    }

    public class Retail_Shop {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Retail Shop Name : ");
        String retail_name=sc.nextLine();
        System.out.print("Enter The Name OF the Product : ");
        String pro_name=sc.nextLine();
        System.out.print("ENter The QUnatity you want in 1,2,3.. : ");
        int qun=sc.nextInt();
        Product_Cal pc=new Product_Cal(retail_name,20,pro_name,qun);
        pc.Display();
        pc.Product_cal();

    }
}
