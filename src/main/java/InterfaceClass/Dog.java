package InterfaceClass;

public class Dog implements Interfaces{
    public static void main(String args[])
    {
        Dog d1= new Dog();
        d1.animalSound();

    }

    public void animalSound() {
        System.out.println("Dog barks");

    }

    public void run() {
        System.out.println("Dog runs");
    }
}
