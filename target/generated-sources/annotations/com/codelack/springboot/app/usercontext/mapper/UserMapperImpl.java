package com.codelack.springboot.app.usercontext.mapper;

import com.codelack.springboot.app.usercontext.ReadUserDTO;
import com.codelack.springboot.app.usercontext.domain.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-01T17:45:52+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public ReadUserDTO readUserDTOToUser(User entity) {
        if ( entity == null ) {
            return null;
        }

        String firstName = null;
        String lastName = null;
        String email = null;
        String imageUrl = null;

        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        email = entity.getEmail();
        imageUrl = entity.getImageUrl();

        ReadUserDTO readUserDTO = new ReadUserDTO( firstName, lastName, email, imageUrl );

        return readUserDTO;
    }
}
