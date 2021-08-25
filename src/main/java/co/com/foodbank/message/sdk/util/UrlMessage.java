package co.com.foodbank.message.sdk.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Class to handle Url for sdk Packaged.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.sdk.util 25/08/2021
 */
@Component
@Validated
public class UrlMessage {

    @Value("${sdk.service.message.scheme}")
    private String urlScheme;

    @Value("${sdk.service.message.url}")
    private String urlBase;


    public String toCreateMessage() {
        return UriComponentsBuilder.newInstance().scheme(urlScheme)
                .host(urlBase).path(SDKMessageParameters.PATH_CREATE_MESSAGE)
                .build().toString();
    }



}
