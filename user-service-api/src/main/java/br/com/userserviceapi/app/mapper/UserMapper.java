package br.com.userserviceapi.app.mapper;

import br.com.lucas.dtos.response.UserResponseDto;
import br.com.userserviceapi.app.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {

    @Mapping(target = "profiles", source = "profile")
    UserResponseDto fromEntity(final User entity);

}
