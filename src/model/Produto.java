package model;

public class Produto {
    private String descricao;
    private Categoria categorias;

    public Produto(String descricao, Categoria categorias) {
        this.descricao = descricao;
        this.categorias = categorias;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategorias() {
        return categorias;
    }
}
