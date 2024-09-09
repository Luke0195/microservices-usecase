package br.com.userserviceapi.app.controller.impl;

import br.com.lucas.models.enums.ProfileEnum;
import br.com.userserviceapi.app.controller.UserController;
import br.com.userserviceapi.app.entity.User;
import br.com.userserviceapi.app.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Set;

@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final  UserServiceImpl userService;

    @Override
    public ResponseEntity<User> findById(String id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }
}
