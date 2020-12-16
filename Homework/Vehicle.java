package Homework;

public class Vehicle {
    protected int power;
    protected int speed;
    protected int weight;
    protected String brand;

    public Vehicle(int power, int speed, int weight, String brand) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void showInfo() {
        System.out.println("Мощность: "+power+" Максимальная скорость: "+speed+" Масса: "+weight+" Марка: "+brand);
    }
    public float powerKl(){
        float newPower;
        newPower = (float) (power*0.74);
        return newPower;
    }
}

