package abstractTree;

/**
 * ArithmException manages the case of an exception due to a division by zero or a
 * negative argument for the function sqrt
 */
public class ArithmException extends Exception {

    public ArithmException(String message){
       super(message);
    }
}
