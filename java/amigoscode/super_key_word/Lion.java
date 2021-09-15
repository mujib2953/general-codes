package super_key_word;

/*
 * * This is Sub-Class
*/
public class Lion extends Animal {

    public Lion() {
        super(4); //? As Lion have 4 legs ;)
    }

    @Override
    public int getLegs() {
        return this.nLegs;
    }
    
}
