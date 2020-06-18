package abstractTree;

/**
 * Aff do the affectation between a string and the value of an AbsTree
 */
public class Aff extends AbstTree{

    /**
     * Value of the affectation
     * */
    private String aff;

    public Aff(AbstTree b, String a) {
        super(new Id(a), b);
        this.aff = a;
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception {

        this.second.read(environment);

        environment.putVariable(this.aff, this.second.getValue());
    }
}
