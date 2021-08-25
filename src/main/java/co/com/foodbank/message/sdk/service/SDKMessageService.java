package co.com.foodbank.message.sdk.service;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import co.com.foodbank.message.dto.MessageDTO;
import co.com.foodbank.message.sdk.exception.SDKMessageServiceException;
import co.com.foodbank.message.sdk.exception.SDKMessageServiceIllegalArgumentException;
import co.com.foodbank.message.sdk.model.ResponseMessageData;
import co.com.foodbank.message.sdk.util.UrlMessage;

/**
 * Class service through rest-template to communicate with the Rest Api Message.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.message.sdk.service
 *         14/08/2021
 */
@Service
@Validated
public class SDKMessageService implements ISDKMessage {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private UrlMessage urlMessage;


    @Override
    public ResponseMessageData create(MessageDTO dto)
            throws SDKMessageServiceIllegalArgumentException,
            SDKMessageServiceException {
        try {
            httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<MessageDTO> entity =
                    new HttpEntity<MessageDTO>(dto, httpHeaders);

            String response =
                    restTemplate
                            .exchange(urlMessage.toCreateMessage(),
                                    HttpMethod.POST, entity, String.class)
                            .getBody();

            return objectMapper.readValue(response,
                    new TypeReference<ResponseMessageData>() {});

        } catch (HttpClientErrorException e) {
            if (e.getStatusCode() == HttpStatus.BAD_REQUEST) {
                throw new SDKMessageServiceIllegalArgumentException(e);
            }
            throw new SDKMessageServiceException(e);

        } catch (ResourceAccessException e) {
            throw new SDKMessageServiceIllegalArgumentException(e);
        } catch (Exception e) {
            throw new SDKMessageServiceException(e);
        }
    }

}
