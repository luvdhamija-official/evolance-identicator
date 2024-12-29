package com.evolvance.identicator.dtos;

import lombok.Data;
import java.util.List;

@Data
public class GoogleOAuthUserDTO {
    private String atHash;
    private String sub;
    private Boolean emailVerified;
    private String iss;
    private String givenName;
    private String nonce;
    private String picture;
    private List<String> aud;
    private String azp;
    private String name;
    private String exp;
    private String familyName;
    private String iat;
    private String email;
}
