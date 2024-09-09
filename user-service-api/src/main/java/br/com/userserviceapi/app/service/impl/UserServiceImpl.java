package br.com.userserviceapi.app.service.impl;

import br.com.lucas.dtos.response.UserResponseDto;
import br.com.userserviceapi.app.entity.User;
import br.com.userserviceapi.app.mapper.UserMapper;
import br.com.userserviceapi.app.repository.UserRepository;
import br.com.userserviceapi.app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDto findById(final String id) {
      User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
      return  userMapper.fromEntity(user);
    }
}
