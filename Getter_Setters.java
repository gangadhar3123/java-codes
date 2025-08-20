class NewCar {
    private int number;
    private String name;
    private String model;

    NewCar(int num, String n, String m) {
        this.number = num;
        this.name = n;
        this.model = m;
    }

    String getName() {
        return this.name;
    }
    String getModel() {
        return this.model;
    }
    int getNumber() {
        return this.number;
    }

    void Setname(String n){
        this.name=n;
    }

    void SetModel(String m){
         this.model=m;
    }
    void SetNUm(int num){
         this.number=num;
    }

}


public class Getter_Setters {
    public static void main(String[] args) {
        NewCar car = new NewCar(45, "Ferrari", "gt4");
        car.SetNUm(90);
        car.Setname("lamborgini");
        System.out.println(car.getModel() + " " + car.getName() + " " + car.getNumber());
    }
}
