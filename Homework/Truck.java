package Homework;

public class Truck extends LandTransport {
    private int liftingCapacity;
    private int cargo;

    public Truck(int power, int speed, int weight, String brand, int ammoutOfWeels, int fuelConsumption, int liftingCapacity,int cargo) {
        super(power, speed, weight, brand, ammoutOfWeels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
        this.cargo = cargo;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    protected void cargo() {
        if (cargo <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
    public void showInfo() {
        super.showInfo();
        System.out.println(" Грузоподъемность: "+liftingCapacity);
    }
}
