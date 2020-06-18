package abstractTree;

/**
 * FloatExp fixes the value for a float
 */
public class FloatExp extends AbstTree {

    public FloatExp(double db){
        super();
        this.value = db;
    }

    @Override
    public String toString() {
        return Double.toString(this.value);
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception {
    }
}
