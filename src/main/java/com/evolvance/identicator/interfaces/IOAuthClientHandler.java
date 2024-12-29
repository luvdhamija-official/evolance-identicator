package com.evolvance.identicator.interfaces;
import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
public interface IOAuthClientHandler {
    public Object processClient(Map<String,Object> userDetailsFromClient) throws JsonProcessingException;
}
