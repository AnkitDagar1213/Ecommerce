package com.example.Ecommerce.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class exception extends RuntimeException {
    public exception(String message) {
        super(message);
    }

    public exception(String message, Throwable cause) {
        super(message, cause);
    }
}
