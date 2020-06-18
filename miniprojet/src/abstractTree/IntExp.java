package abstractTree;

/**
 * IntExp fixes the value for an int
 */
public class IntExp extends AbstTree {

    public IntExp(Integer a){
        super();
        this.value = (double)a;
    }
    @Override
    public String toString() {
        return Double.toString(this.value);
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception {
    }
}
