interface Interfaces {
    public void animalSound(); // interface method (does not have a body)
    public void run();
}
class Pig implements Interfaces {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
    public void run(){

    }
}