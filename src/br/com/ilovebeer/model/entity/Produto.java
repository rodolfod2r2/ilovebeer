package br.com.ilovebeer.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id", columnDefinition = "integer", length = 11)
    private int id;

    @Column(name = "produto_nome", nullable = true, length = 150)
    private String nome;

    @Column(name = "produto_preco", nullable = true)
    private double preco;

    @OneToOne
    private Fornecedor fornecedor;

    @Column(name = "produto_estoque", nullable = true)
    private double qtdEstoque;

    public Produto() {
    }

    public Produto(String nome, double preco, Fornecedor fornecedor, double qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.qtdEstoque = qtdEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
