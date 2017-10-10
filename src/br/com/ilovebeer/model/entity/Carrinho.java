package br.com.ilovebeer.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "carrinho")
public class Carrinho {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrinho_id", columnDefinition = "integer", length = 11)
    private int id;

    @Column(name = "carrinho_data")
    private String data;

    @OneToOne
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<ItemCarrinho> carrinhoList = new ArrayList<>();

    public Carrinho() {
    }

    public Carrinho(String data, List<ItemCarrinho> carrinhoList) {
        this.data = data;
        this.carrinhoList = carrinhoList;
    }

    public Carrinho(String data, Cliente cliente, List<ItemCarrinho> carrinhoList) {
        this.data = data;
        this.cliente = cliente;
        this.carrinhoList = carrinhoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemCarrinho> getCarrinhoList() {
        return carrinhoList;
    }

    public void setCarrinhoList(List<ItemCarrinho> carrinhoList) {
        this.carrinhoList = carrinhoList;
    }

    public void adicionarItem(ItemCarrinho itemCarrinho) {
        carrinhoList.add(itemCarrinho);
    }

    public void limparCarrinho() {
        carrinhoList.clear();
    }
}
