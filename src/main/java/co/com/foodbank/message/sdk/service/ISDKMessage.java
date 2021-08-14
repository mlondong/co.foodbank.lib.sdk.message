package co.com.foodbank.message.sdk.service;

import co.com.foodbank.message.dto.MessageDTO;
import co.com.foodbank.message.sdk.exception.SDKMessageServiceException;
import co.com.foodbank.message.sdk.exception.SDKMessageServiceIllegalArgumentException;
import co.com.foodbank.message.sdk.model.ResponseMessageData;

/**
 * Interface ISDMessage to show only the getter methods.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.message.sdk.service
 *         14/08/2021
 */
public interface ISDKMessage {


    ResponseMessageData create(MessageDTO dto)
            throws SDKMessageServiceIllegalArgumentException,
            SDKMessageServiceException, SDKMessageServiceException;

}
