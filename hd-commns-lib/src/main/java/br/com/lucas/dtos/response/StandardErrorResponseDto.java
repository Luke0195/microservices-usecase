package br.com.lucas.dtos.response;

import br.com.lucas.models.enums.ProblemType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Set;


public record StandardErrorResponseDto(
        LocalDateTime timestamp,
        Integer status,
        String error,
        String path,
        @JsonProperty("exception_message")
        String exceptionMessage,
        @JsonProperty("problem_type")
        ProblemType problemType,
        Set<Object> errors
        ) {
}
