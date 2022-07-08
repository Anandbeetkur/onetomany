package com.example.aeroparker.customException;

import lombok.Data;

@Data
public class ControllerException extends RuntimeException{
    private   String errorCode;
    private  String errorMessage;
}
