package super_key_word;

/*
 * * This is Sub-Class
*/
public class Monkey extends Animal {

    public Monkey() {
        super(2); //? As monkey has 2 legs ;)
    }


    @Override
    public int getLegs() {
        return this.nLegs;
    }
    
    public void saySomething() {
        System.out.println("Hi, I'm Monkey ;)\n");
    }
}
