package br.com.lucas.dtos.response;

import br.com.lucas.models.enums.ProfileEnum;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

public record UserResponseDto(
        String id,
        String name,
        String email,
        String password,
        Set<ProfileEnum> profiles,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) implements Serializable {
}
