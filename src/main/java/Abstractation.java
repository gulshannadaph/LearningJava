abstract class Abstractation {

        public abstract void animalSound();
        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
}

class Pig extends Abstractation {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Dog says: Bhow Bhow");
    }
}
class MyMainClass {
    public static void main(String[] args) {
        Pig myDog = new Pig(); // Create a Pig object
        myDog.animalSound();
        myDog.sleep();

    }
}
