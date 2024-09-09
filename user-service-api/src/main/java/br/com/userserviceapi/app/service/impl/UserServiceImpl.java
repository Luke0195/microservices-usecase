package br.com.userserviceapi.app.service.impl;

import br.com.userserviceapi.app.entity.User;
import br.com.userserviceapi.app.repository.UserRepository;
import br.com.userserviceapi.app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(final String id) {
        return userRepository.findById(id).orElse(null);
    }
}
