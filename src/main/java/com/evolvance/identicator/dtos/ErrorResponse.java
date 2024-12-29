package com.evolvance.identicator.dtos;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ErrorResponse {
    public HttpStatus status;
    public String message;
}
