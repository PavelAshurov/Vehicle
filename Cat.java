public class Cat extends Animal {
    private boolean catchMouse;
    private String insta;

    public Cat(String name, int age,boolean catchMouse,String insta){
        super(name, age);
        this.catchMouse = catchMouse;
        this.insta = insta;
    }
    public boolean getCatchMouse(){
        return catchMouse;
    }
    public void setCatchMouse(){
        this.catchMouse = catchMouse;
    }
    public String getInsta(){
        return insta;
    }
    public void setInsta(){
        this.insta = insta;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Ловиит ли мышей "+catchMouse);
        System.out.println("Истаграмм: "+insta);
    }
    public void greet(){
        System.out.println("Meow");
    }

}
