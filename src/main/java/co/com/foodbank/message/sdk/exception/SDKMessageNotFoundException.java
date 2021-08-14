package co.com.foodbank.message.sdk.exception;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.sdk.exception
 *         9/07/2021
 */
public class SDKMessageNotFoundException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id;

    public SDKMessageNotFoundException(String id, String message) {
        super(message);
        this.setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }



}
