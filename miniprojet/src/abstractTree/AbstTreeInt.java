package abstractTree;

/**
 * Interface for AbsTree
 */
public interface AbstTreeInt {

	/**
	* Read the expression and evaluates it
	*/
	void readExpression(EnvironmentInt environment) throws Exception;

	/**
	* Return the value of the node
	*/
	Double getValue();
	

}
