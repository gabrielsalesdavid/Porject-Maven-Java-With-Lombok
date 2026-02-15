package br.com.maven.fundamento.java.dio.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserMODEL {

    private int code;
    private String userName;
    private LocalDate birthDay;
}
