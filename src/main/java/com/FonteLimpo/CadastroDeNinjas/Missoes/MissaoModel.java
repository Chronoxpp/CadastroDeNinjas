package com.FonteLimpo.CadastroDeNinjas.Missoes;

import com.FonteLimpo.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "missao")
public class MissaoModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private NinjaModel ninja;
}
