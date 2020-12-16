package Homework;

public class LandTransport extends Vehicle{
    private int ammoutOfWeels ;
    protected int fuelConsumption;

    public LandTransport(int power, int speed, int weight, String brand, int ammoutOfWeels, int fuelConsumption) {
        super(power, speed, weight, brand);
        this.ammoutOfWeels = ammoutOfWeels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getAmmoutOfWeels() {
        return ammoutOfWeels;
    }

    public void setAmmoutOfWeels(int ammoutOfWeels) {
        this.ammoutOfWeels = ammoutOfWeels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" Расход топлива: "+fuelConsumption+" Количество колес: "+ammoutOfWeels);
    }
}
