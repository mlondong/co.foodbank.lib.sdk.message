package co.com.foodbank.message.sdk.exception;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.sdk.exception
 *         15/06/2021
 */
public class SDKMessageServiceNotAvailableException
        extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SDKMessageServiceNotAvailableException(Exception e) {
        super(e);
    }

}
