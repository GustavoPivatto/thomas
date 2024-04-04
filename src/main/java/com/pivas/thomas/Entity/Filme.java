package com.pivas.thomas.Entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity(name = "filmes")
@Table(name="filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String filme_id;
    private String titulo;
    private String diretor;
    private int ano_lancamento;
    private String pais;
    
public UUID getId() {
        return id;
    }

public void setId(UUID id) {
    this.id = id;
    }
public String getTitulo() {
    return titulo;
}

public String getDiretor() {
    return diretor;
}

public int getAnoLancamento() {
    return ano_lancamento;
}

public String getPais() {
    return pais;
}

public String getFilmeId(){
    return filme_id;
}

public void setFilmeId(String filme_id) {
    this.filme_id = filme_id;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public void setDiretor(String diretor) {
    this.diretor = diretor;
}

public void setAnoLancamento(int ano_lancamento) {
    this.ano_lancamento = ano_lancamento;
}

public void setPais(String pais) {
    this.pais = pais;
}

}

