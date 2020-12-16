package Homework;

public class Car extends LandTransport{
    private String cargoType;
    private int ammountOfPassengers;
    private float time;

    public Car(int power, int speed, int weight, String brand, int ammoutOfWeels, int fuelConsumption, String cargoType, int ammountOfPassengers,int time) {
        super(power, speed, weight, brand, ammoutOfWeels, fuelConsumption);
        this.cargoType = cargoType;
        this.ammountOfPassengers = ammountOfPassengers;
        this.time = time;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public int getAmmountOfPassengers() {
        return ammountOfPassengers;
    }

    public void setAmmountOfPassengers(int ammountOfPassengers) {
        this.ammountOfPassengers = ammountOfPassengers;
    }

    public float getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    protected void distance(){
        float way;
        way = time*super.speed;
        float fuel;
        fuel = (way/100)*super.fuelConsumption;
        System.out.println("За время: "+time+"ч"+" Автомобиль: "+brand+" Двигаясь с максимальной скоростью: "+speed+"км/ч"+" Проедет: "+way+" и израсходует "+fuel+" топлива");
    }


    public void showInfo() {
        super.showInfo();
        System.out.println(" Тип кузова: "+cargoType+" Колличество пассажиров: "+ammountOfPassengers+"Мощность в киловаттах: "+powerKl());
    }

}
