package com.evolvance.identicator.services.OAuthClients;

import com.evolvance.identicator.interfaces.IOAuthClientHandler;
import java.util.*;

import org.springframework.stereotype.Component;

@Component("githubOAuthClient")
public class GithubOAuthClient implements IOAuthClientHandler{

    @Override
    public Object processClient(Map<String,Object>userDetails) {
        throw new UnsupportedOperationException("Unimplemented method 'processClient'");
    }

    
}