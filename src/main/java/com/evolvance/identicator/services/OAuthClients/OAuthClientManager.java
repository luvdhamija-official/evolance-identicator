package com.evolvance.identicator.services.OAuthClients;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evolvance.identicator.interfaces.IOAuthClientHandler;

import java.util.*;

@Service
public class OAuthClientManager {
    @Autowired  
    BeanFactory beanFactory;
    
    public String manageUserClientDetails(String clientName,Map<String,Object>userClientDetails)
    {
        IOAuthClientHandler handler = beanFactory.getBean("%sOAuthClient".formatted(clientName),IOAuthClientHandler.class);
        try {
            handler.processClient(userClientDetails);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.err.println(e);
        }
        return "";
    }
}
