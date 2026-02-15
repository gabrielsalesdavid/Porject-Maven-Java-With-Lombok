package br.com.maven.fundamento.java.dio.mapper;

import br.com.maven.fundamento.java.dio.dto.UserDTO;
import br.com.maven.fundamento.java.dio.model.UserMODEL;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-15T10:48:40-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class IUserMAPPERImpl implements IUserMAPPER {

    @Override
    public UserMODEL toModel(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserMODEL userMODEL = new UserMODEL();

        userMODEL.setCode( dto.getId() );
        userMODEL.setUserName( dto.getName() );
        userMODEL.setBirthDay( dto.getBirthDay() );

        return userMODEL;
    }

    @Override
    public UserDTO toDTO(UserMODEL model) {
        if ( model == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( model.getCode() );
        userDTO.setName( model.getUserName() );
        userDTO.setBirthDay( model.getBirthDay() );

        return userDTO;
    }
}
