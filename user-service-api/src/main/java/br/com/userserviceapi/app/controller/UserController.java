package br.com.userserviceapi.app.controller;

import br.com.lucas.dtos.response.UserResponseDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public interface UserController {

    @GetMapping("/{id}")
    ResponseEntity<UserResponseDto> findById(@PathVariable(name="id") final String id);

}
