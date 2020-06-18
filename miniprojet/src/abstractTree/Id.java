package abstractTree;

/**
 * Id fixes the value for an id
 */
public class Id extends AbstTree {

    String id;

    public Id(String id){
        super();
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception {
         this.value = environment.getVariableValue(id);
    }
}
