package br.com.maven.fundamento.java.dio.mapper;

import br.com.maven.fundamento.java.dio.dto.UserDTO;
import br.com.maven.fundamento.java.dio.model.UserMODEL;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IUserMAPPER {

    @Mapping(target = "code", source = "id")
    @Mapping(target = "userName", source = "name")
    UserMODEL toModel(final UserDTO dto);

    @Mapping(target = "id", source = "code")
    @Mapping(target = "name", source = "userName")
    UserDTO toDTO(final UserMODEL model);
}
