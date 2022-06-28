package br.com.jose.car.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "marca")
public class marcaModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "nome", nullable = false, length = 40)
    private String nome;

    @Column (name = "pais", nullable = false, length = 40)
    private String pais;



    public marcaModel() {
    }

    public marcaModel(long id, String nome, String pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
