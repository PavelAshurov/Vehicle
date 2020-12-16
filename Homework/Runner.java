package Homework;

public class Runner {
    public static void main(String[] args) {


        Car t = new Car(100, 230, 1000, "Ford", 4, 20, "Седан", 5,2);
        t.showInfo();
        t.distance();
        System.out.println("");
        Truck c = new Truck(100,150,2000,"Volvo",8,25,1000,1500);
        c.showInfo();
        c.cargo();
        System.out.println("");
        Civil k = new Civil(1000,900,10000,"Boing",500,2,200,true,250);
        k.showInfo();
        k.capacity();
        System.out.println("");
        Military l = new Military(1500,3000,3000,"Apach",300,1000,true,1);
        l.showInfo();
        l.rocket();
        l.enjection();
    }
}