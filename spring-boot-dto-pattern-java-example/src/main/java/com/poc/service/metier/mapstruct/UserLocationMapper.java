package com.poc.service.metier.mapstruct;

import com.poc.donnee.domain.Location;
import com.poc.donnee.domain.User;
import com.poc.donnee.dto.UserLocationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserLocationMapper {
    @Mapping(source = "users.id", target = "userId")
    List<UserLocationDTO> toDtos(List<User> users);
}
