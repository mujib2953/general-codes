package super_key_word;

/**
 * * This is super class
*/
public abstract class Animal {
    public int nLegs = 0;

    //* This the setter of {nLegs}
    public void numberOfLegs(int legs) {
        this.nLegs = legs;
    }

    //* This is getter of {nLegs}, and also it is abstract so concrete class will have to override it.
    public abstract int getLegs();

    //? Default constructor
    public Animal() {}

    public Animal(int nLegs) {
        this.nLegs = nLegs;
    }
}
