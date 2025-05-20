package br.com.fiap.produtos;

import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.model.Produtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Categoria eletronicos = new Categoria();
        eletronicos.setId(1l).setNome("Eletrônicos");

        Produtos produto = new Produtos();
        produto.setId(1l)
                .setNome("Celular alcatel")
                .setDescricao("Aparelho celular modelo alcatel 256gb")
                .setCategoria(eletronicos)
                .setDataCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(800));

        System.out.println("Categoria: " + eletronicos);
        System.out.println("Produtos: " + produto);
    }
}