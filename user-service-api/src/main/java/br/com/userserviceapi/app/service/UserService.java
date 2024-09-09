package br.com.userserviceapi.app.service;

import br.com.userserviceapi.app.entity.User;

public interface UserService {

    public User findById(String id);
}
