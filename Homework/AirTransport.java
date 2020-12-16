package Homework;

public class AirTransport extends Vehicle {
    private int wingspan;
    private int minLength;

    public AirTransport(int power, int speed, int weight, String brand, int wingspan, int minLength) {
        super(power, speed, weight, brand);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" Размах крыльев: "+wingspan+" Минимальная длинна взлетно-посадочной полосы для взлета: "+minLength);
    }
}
