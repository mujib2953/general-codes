package super_key_word;

/*
* * This is main class which would be called first.
*/
public class MainClass {
    public static void main(String[] args) {
        Animal jay = new Monkey();
        System.out.println("Jay monkey have " + jay.getLegs() + " legs.");

        // jay.saySomething(); //! we can't directly call {saySomething} method as object is Animal type instead of Monkey
        //? To solve this we can perform casting
        ((Monkey) jay).saySomething();

        Animal rambo = new Lion();
        System.out.println("Rambo lion have " + rambo.getLegs() + " legs.");

        // Animal o = new Animal(); //! This is super abstract class so we can't create any object of it
    }
}
