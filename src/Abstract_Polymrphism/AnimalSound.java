package Abstract_Polymrphism;

public interface AnimalSound {
    void makeSound();
}
  class Dog implements AnimalSound{
      @Override
      public void makeSound() {
          System.out.println("go go ");
      }
  }
 class Cat implements AnimalSound{
    @Override
     public void makeSound(){
        System.out.println("meow meow");
    }
 }