package com.sensedia.model.dto.response;

import com.sensedia.configuration.MessageConfig;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ErrorResponse {

    private String code;

    private String message;

    public ErrorResponse(String code, Object... args) {
        this.code = code;
        this.message = new MessageConfig().getMessage(code, args);
    }
}
