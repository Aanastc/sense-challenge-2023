package com.sensedia.exception;

import org.springframework.http.HttpStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConflictException extends RestException {

    private static final long serialVersionUID = -4546342692615580312L;

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.CONFLICT;
    }

}
