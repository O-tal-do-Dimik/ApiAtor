package com.example.apiator;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long id;
    String nome;
    String nacionalidade;
    String datanacimento;
    String indicacoes;
    Integer idade;
    Integer oscar;


}
