public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name,int age ){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public void getInfo(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
    public abstract void greet();
}
