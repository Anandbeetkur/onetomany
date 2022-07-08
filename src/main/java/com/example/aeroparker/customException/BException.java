package com.example.aeroparker.customException;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BException extends RuntimeException{
    private   String errorCode;
    private  String errorMessage;
}
