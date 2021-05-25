package br.com.mtisi.services.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
