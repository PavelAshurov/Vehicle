package Homework;

public class Military extends AirTransport{
    private boolean ejectionSystem;
    private int ammountOfRocets;

    public Military(int power, int speed, int weight, String brand, int wingspan, int minLength, boolean ejectionSystem, int ammountOfRocets) {
        super(power, speed, weight, brand, wingspan, minLength);
        this.ejectionSystem = ejectionSystem;
        this.ammountOfRocets = ammountOfRocets;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getAmmountOfRocets() {
        return ammountOfRocets;
    }

    public void setAmmountOfRocets(int ammountOfRocets) {
        this.ammountOfRocets = ammountOfRocets;
    }
    protected void rocket(){
        if (ammountOfRocets!=0){
            System.out.println("Ракета пошла...");
        }else {
            System.out.println("Боеприпасы отстствуют");
        }
    }
    protected void enjection(){
        if (ejectionSystem = true){
            System.out.println("Катапультирование произошло успешно");
        }else {
            System.out.println("У вас нет такой системы");
        }
    }
    public void showInfo() {
        super.showInfo();
    }
}
