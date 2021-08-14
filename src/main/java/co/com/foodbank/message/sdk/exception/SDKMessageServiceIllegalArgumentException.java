package co.com.foodbank.message.sdk.exception;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.sdk.exception
 *         15/06/2021
 */
public class SDKMessageServiceIllegalArgumentException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SDKMessageServiceIllegalArgumentException(Exception e) {
        super(e);
    }
}
