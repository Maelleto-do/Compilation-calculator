package abstractTree;

public class Div extends AbstTree {

    public Div(AbstTree a, AbstTree b){
        super(a, b);
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception{

        this.first.read(environment);
        this.second.read(environment);

        if (this.second.getValue() == 0){
            throw new ArithmException("CRITICAL ERROR : DIVISION BY ZERO");
        }else {
            this.value = this.first.getValue() / this.second.getValue();
        }
    }
}
