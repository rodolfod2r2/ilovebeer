package br.com.ilovebeer.model.entity;

import javax.persistence.*;


@Entity
@Table(name = "item_carrinho")
public class ItemCarrinho {

    private int id;
    private Produto produto;
    private double quantidade;

    public ItemCarrinho() {
    }

    public ItemCarrinho(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_carrinho_id", columnDefinition = "integer", length = 11)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Column(name = "item_carrinho_quantidade")
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
