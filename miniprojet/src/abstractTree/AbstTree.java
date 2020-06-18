package abstractTree;
import beaver.Symbol;

/**
 * Abstract class to represent the tree
 */
public abstract class AbstTree extends Symbol implements AbstTreeInt {

	/*
	* First son (on the left)
	*/
	protected AbstTree first;

	/*
	 * Second son (on the right)
	 */
	protected AbstTree second;

	/*
	 * Value of the node
	 */
	protected Double value;

	/**
	 * Constructor for AbsTree, when two sons are present
	 * @param first
	 * @param second
	 */
	public AbstTree(AbstTree first, AbstTree second) {
		super();
		this.first = first;
		this.second = second;
	}

	/**
	 * Constructor for AbsTree when the node has a unique son
	 * @param first
	 */
	public AbstTree(AbstTree first) {
		super();
		this.first = first;
	}

	/**
	 * Constructor when there is no son
	 */
	public AbstTree() {
		super();
	}

	/**
	 * @return the value of the node
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @return print the Tree
	 */
	public String toString() {
		if (first != null) {
			if (second != null)
				return "(" + first.toString() + "," + second.toString() + ")";
			else
				return "(" + first.toString() + ")";
		} else {
			return this.getClass().getSimpleName();
		}
	}

	/**
	 * Valuate the expression
	 * @param environment
	 * @throws Exception
	 */
	public void readExpression(EnvironmentInt environment) throws Exception {
		this.read(environment);
	}

	/**
	 * Read the expression
	 * @param environment
	 * @throws Exception
	 */
	abstract protected void read(EnvironmentInt environment) throws Exception;
}
