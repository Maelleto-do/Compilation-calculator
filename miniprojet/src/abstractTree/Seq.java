package abstractTree;

/**
 * Seq represents a node of the AbsTree
 */
public class Seq extends AbstTree{

    public Seq(AbstTree a, AbstTree b){
        super(a, b);
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception {

        this.first.read(environment);
        this.second.read(environment);

        this.value = this.second.getValue();
    }
}
