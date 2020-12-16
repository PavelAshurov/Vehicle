public class Runner {
 public static void main(String[] args) {
  Cat cat = new Cat("Barsik",7,true,"http://istagram.com/barsik228");
  cat.getInfo();
  Animal dog = new Dog("Kim",10,20);
  dog.getInfo();
  dog.greet();
 }
}