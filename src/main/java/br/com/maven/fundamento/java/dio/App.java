package br.com.maven.fundamento.java.dio;

import br.com.maven.fundamento.java.dio.dto.UserDTO;
import br.com.maven.fundamento.java.dio.model.UserMODEL;

import java.time.LocalDate;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.maven.fundamento.java.dio.mapper.IUserMAPPER;

public class App {

    private final static IUserMAPPER mapper = Mappers.getMapper(IUserMAPPER.class);

    public static void main(String[] args) {
        UserMODEL userModel = new UserMODEL();
        userModel.setCode(1);
        userModel.setUserName("James");
        userModel.setBirthDay(LocalDate.now().minusYears(20));
        System.out.println(mapper.toDTO(userModel));

        UserDTO userDto = new UserDTO();
        userDto.setId(2);
        userDto.setName("Maria");
        userDto.setBirthDay(LocalDate.now().minusYears(30));
        System.out.println(mapper.toModel(userDto));
    }
}
