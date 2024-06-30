package com.codelack.springboot.app.usercontext.mapper;

import com.codelack.springboot.app.usercontext.ReadUserDTO;
import com.codelack.springboot.app.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);
}
