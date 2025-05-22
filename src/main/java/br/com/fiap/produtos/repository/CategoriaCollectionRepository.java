package br.com.fiap.produtos.repository;

import br.com.fiap.produtos.model.Categoria;

import javax.swing.*;
import java.util.List;
import java.util.Vector;

public class CategoriaCollectionRepository {

    private static List<Categoria> categorias;

    static {

        categorias = new Vector<>();

        Categoria eletronicos = new Categoria("Eletrônicos");
        Categoria livros = new Categoria("livros");

        categorias.add(eletronicos);
        categorias.add(livros);

    }

    public static List<Categoria> findAll(){
        return categorias;
    }
    public static Categoria findById(Long id){
        return categorias.stream()
                .filter(categoria -> categoria.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static Categoria save(Categoria categoria){
        if(!categorias.contains(categoria)){
            categoria.setId((long)categorias.size() + 1);
            categorias.add(categoria);
            return categoria;
        }else {
            JOptionPane.showMessageDialog(null, "Já existe uma categoria com este nome!");
            return null;
        }
    }

}
