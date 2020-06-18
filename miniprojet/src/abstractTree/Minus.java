package abstractTree;

/**
 * Minus manages the cases of a difference between two values (a-b)
 */
public class Minus extends AbstTree {

    public Minus(AbstTree a, AbstTree b){
        super(a, b);
    }

    public Minus(AbstTree a) {
        super(a);
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception {

        //In case of a unary minus
        if (this.second == null){
            this.first.read(environment);
            this.value =  -(this.first.getValue());
        }else {
            this.first.read(environment);
            this.second.read(environment);
            this.value = this.first.getValue() - this.second.getValue();
        }
    }
}
