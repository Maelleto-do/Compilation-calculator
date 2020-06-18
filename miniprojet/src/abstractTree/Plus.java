package abstractTree;

/**
 * Plus manages the addition of two values (a+b)
 */
public class Plus extends AbstTree {

    public Plus(AbstTree a, AbstTree b){
        super(a, b);
    }

    protected void read(EnvironmentInt environment) throws Exception{

        this.first.read(environment);
        this.second.read(environment);

        this.value =  this.first.getValue() + this.second.getValue();
    }
}
