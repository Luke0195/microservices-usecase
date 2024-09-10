package br.com.userserviceapi.app.controller.impl;

import br.com.lucas.dtos.response.UserResponseDto;
import br.com.userserviceapi.app.controller.UserController;
import br.com.userserviceapi.app.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final  UserServiceImpl userService;

    @Override
    public ResponseEntity<UserResponseDto> findById(String id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }
}
