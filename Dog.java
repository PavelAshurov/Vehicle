public class Dog extends Animal{
    private int ammoutOfcommands;

    public Dog(String name,int age,int ammoutOfcommands){
        super(name,age);
        this.ammoutOfcommands = ammoutOfcommands;
    }
    public int getAmmoutOfcommands(){
        return ammoutOfcommands;
    }
    public void setAmmoutOfcommands(){
        this.ammoutOfcommands = ammoutOfcommands;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Выполняет команд: "+ammoutOfcommands);
    }

    public void greet(){
        System.out.println("Woof");
    }





}
