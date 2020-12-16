package Homework;

public class Civil extends AirTransport {
    private int ammountOfPassengers;
    private boolean buissnesClass;
    private int passengers;

    public Civil(int power, int speed, int weight, String brand, int wingspan, int minLength, int ammountOfPassengers, boolean buissnesClass,int passengers) {
        super(power, speed, weight, brand, wingspan, minLength);
        this.ammountOfPassengers = ammountOfPassengers;
        this.buissnesClass = buissnesClass;
        this.passengers = passengers;
    }

    public int getAmmountOfPassengers() {
        return ammountOfPassengers;
    }

    public void setAmmountOfPassengers(int ammountOfPassengers) {
        this.ammountOfPassengers = ammountOfPassengers;
    }

    public boolean isBuissnesClass() {
        return buissnesClass;
    }

    public void setBuissnesClass(boolean buissnesClass) {
        this.buissnesClass = buissnesClass;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    protected void capacity(){
        if (passengers <= ammountOfPassengers) {
            System.out.println("Пассажиры поместились");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Колличество пассажиров: "+ammountOfPassengers+" Наличие бизнес класса: "+buissnesClass);
    }
}
