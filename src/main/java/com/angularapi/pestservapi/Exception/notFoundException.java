package com.angularapi.pestservapi.Exception;

public class notFoundException extends RuntimeException{
    public notFoundException(String message){
        super(message);
    }
}
