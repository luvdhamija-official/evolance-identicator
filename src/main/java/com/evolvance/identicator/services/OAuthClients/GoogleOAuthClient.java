package com.evolvance.identicator.services.OAuthClients;

import com.evolvance.identicator.dtos.GoogleOAuthUserDTO;
import com.evolvance.identicator.interfaces.IOAuthClientHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

import org.springframework.stereotype.Component;

@Component("googleOAuthClient")
public class GoogleOAuthClient implements IOAuthClientHandler{

    @Override
    public Object processClient(Map<String,Object>userDetails){
        // TODO Auto-generated method stub
        ObjectMapper objectMapper =new ObjectMapper();
        GoogleOAuthUserDTO user;
        try {
            user = objectMapper.readValue(objectMapper.writeValueAsString(userDetails),GoogleOAuthUserDTO.class);
            System.err.println(user);
            System.err.println(userDetails);
            throw new UnsupportedOperationException(user.toString());
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
       
    }

}