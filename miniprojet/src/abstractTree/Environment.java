package abstractTree;
import java.util.HashMap;
import java.util.Map;

/**
 * Environment is used to register variables and their values
 */
public class Environment implements EnvironmentInt {

	private HashMap<String, Double> table;

	public Environment() {
		this.table = new HashMap<>();
	}

	@Override
	public void putVariable(String variable, Double value) {
		table.put(variable, value);
	}

	@Override
	public Double getVariableValue(String variable) {
		return table.get(variable);
	}


}
