package co.com.foodbank.message.sdk.model;

import java.util.Date;
import co.com.foodbank.user.dto.response.UserData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class ResponseMessageData to represent a Message.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.message.sdk.model
 *         14/08/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessageData {

    private String id;

    private Date dateMessage;

    private String subject;

    private String description;

    private UserData user;
}
