package br.com.userserviceapi.app.controller.exceptions;

import br.com.lucas.dtos.response.StandardErrorResponseDto;
import br.com.lucas.exceptions.ResourceNotFoundException;
import br.com.lucas.models.enums.ProblemType;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashSet;

@ControllerAdvice
public class UserServiceApiExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardErrorResponseDto> handleResourceNotFound(final HttpServletRequest httpServletRequest,
                                                                          final ResourceNotFoundException exception){
     HttpStatus badRequest = HttpStatus.BAD_REQUEST;
    StandardErrorResponseDto responseError = new StandardErrorResponseDto(
            LocalDateTime.now(),
            badRequest.value(),
            "Entity not found", httpServletRequest.getRequestURI(),
            exception.getMessage(), ProblemType.RESOURCE_NOTFOUND, new HashSet<>());
    return ResponseEntity.status(badRequest).body(responseError);
    };



}
