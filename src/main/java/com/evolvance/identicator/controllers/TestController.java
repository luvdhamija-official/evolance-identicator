package com.evolvance.identicator.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evolvance.identicator.services.OAuthClients.OAuthClientManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1")
public class TestController {

  @Autowired
  OAuthClientManager oAuthClientManager;

  @GetMapping("/userGate")
  public ResponseEntity<String> sayHello(OAuth2AuthenticationToken authentication, @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient clientDetails)  {
    oAuthClientManager.manageUserClientDetails(clientDetails.getClientRegistration().getRegistrationId(), authentication.getPrincipal().getAttributes());
    return ResponseEntity.ok("Hell OAuth2");
  }
}