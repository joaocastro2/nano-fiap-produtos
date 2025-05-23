package br.com.fiap.produtos;

import br.com.fiap.produtos.model.Categoria;
import br.com.fiap.produtos.model.Produtos;
import br.com.fiap.produtos.repository.CategoriaCollectionRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Categoria categoria = new Categoria();
        categoria.setNome("Eletrônicos");

        Categoria categoriaSalva = CategoriaCollectionRepository.save(categoria);
        System.out.println("Categoria: " + categoriaSalva);


    }
}