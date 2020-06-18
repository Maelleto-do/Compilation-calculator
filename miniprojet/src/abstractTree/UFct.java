package abstractTree;

/**
 * UFct describes function with one argument
 */
public class UFct extends AbstTree {

    private String name;

    public UFct(AbstTree a, String fct) {
        super(a);
        this.name = fct;
    }

    @Override
    protected void read(EnvironmentInt environment) throws Exception{

        this.first.read(environment);

        //Calculates the value for each possible function
        switch (this.name){
            case "sin" : this.value = Math.sin(this.first.getValue()); break;
            case "tan" : this.value = Math.tan(this.first.getValue()); break;
            case "cos" : this.value = Math.cos(this.first.getValue()); break;
            case "abs" : this.value = Math.abs(this.first.getValue()); break;
            case "round" : this.value = (double) Math.round(this.first.getValue()); break;
        }

        //In case of a negative value in sqrt, the program is automatically stopped
        if (this.name.equals("sqrt")){
            if (this.first.getValue() < 0){
                throw new ArithmException("sqrt(x) : NEGATIVE ARGUMENT");
            }
            else {
                this.value = Math.sqrt(this.first.getValue());
            }
        }
    }
}
