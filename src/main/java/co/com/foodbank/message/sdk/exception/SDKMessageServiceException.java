package co.com.foodbank.message.sdk.exception;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.sdk.exception
 *         15/06/2021
 */
public class SDKMessageServiceException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SDKMessageServiceException(Exception e) {
        super(e);
    }
}
