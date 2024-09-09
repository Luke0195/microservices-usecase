package br.com.userserviceapi.app.service;

import br.com.lucas.dtos.response.UserResponseDto;


public interface UserService {

    public UserResponseDto findById(String id);
}
