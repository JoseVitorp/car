package br.com.jose.car.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "modelo")
public class modeloModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "nome", nullable = false, length = 40)
    private String nome;

    @Column (name = "ano", nullable = false, length = 40)
    private long ano;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private marcaModel marca;

    public modeloModel() {
    }

    public modeloModel(long id, String nome, long ano, marcaModel marca) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.marca = marca;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getAno() {
        return ano;
    }

    public void setAno(long ano) {
        this.ano = ano;
    }

    public marcaModel getMarca() {
        return marca;
    }

    public void setMarca(marcaModel marca) {
        this.marca = marca;
    }
}