/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nc.tools.ui.components.exceptions;

/**
 *
 * @author vivek
 */
public class DuplicateKeyException extends RuntimeException {
    
    public DuplicateKeyException(){
        super("Duplicate key not allowed in the list");
    }
    
    public DuplicateKeyException(String message){
        super(message);
    }
    
    public DuplicateKeyException(String message, Throwable cause){
        super(message, cause);
    }       
    
}
