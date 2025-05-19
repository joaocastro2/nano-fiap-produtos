package br.com.fiap.produtos.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Produtos {

    String nome;
    Long id;
    BigDecimal preco;
    LocalDateTime dataCadastro;
    String descricao;
    Categoria categoria;

    public Produtos() {
    }

    public Produtos(String nome, Long id, BigDecimal preco, LocalDateTime dataCadastro, String descricao, Categoria categoria) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Produtos(String nome, BigDecimal preco, LocalDateTime dataCadastro, String descricao, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Objects.equals(nome, produtos.nome) && Objects.equals(id, produtos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id);
    }

    @Override
    public String toString() {
        return nome.toUpperCase();
    }
}
