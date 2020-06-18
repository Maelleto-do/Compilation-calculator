package abstractTree;


/**
 * Function describes function with two arguments
 */
public class BFct extends AbstTree {

    private String name;

    public BFct(AbstTree a, AbstTree b, String fct) {
        super(a, b);
        this.name = fct;
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception {
        this.first.read(environment);
        this.second.read(environment);

        if (name.equals("min")) {this.value = Math.min(this.second.getValue(), this.first.getValue());}
        if (name.equals("max")) {this.value = Math.max(this.second.getValue(), this.first.getValue());}
        if (name.equals("hypot")) {this.value = Math.hypot(this.first.getValue(), this.second.getValue());}

    }
}
