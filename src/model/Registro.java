package model;

import java.util.Date;

public class Registro {
    private float preco;
    private Date data;
    private Produto produto;
    private Site site;

    public Registro(float preco, Date data, Produto produto, Site site) {
        this.preco = preco;
        this.data = data;
        this.produto = produto;
        this.site = site;
    }

    public float getPreco() {
        return preco;
    }

    public Date getData() {
        return data;
    }

    public Produto getProduto() {
        return produto;
    }

    public Site getSite() {
        return site;
    }
}
