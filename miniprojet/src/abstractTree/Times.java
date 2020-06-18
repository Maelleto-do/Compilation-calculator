package abstractTree;

/**
 * Times manages the multiplication between two values (a*b)
 */
public class Times extends AbstTree {

    public Times(AbstTree a, AbstTree b){
        super(a, b);
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception {

        this.first.read(environment);
        this.second.read(environment);

        this.value =  this.first.getValue() * this.second.getValue();
    }
}
