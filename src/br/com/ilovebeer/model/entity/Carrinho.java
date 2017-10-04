package br.com.ilovebeer.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "carrinho")
public class Carrinho {

    private int id;
    private String data;
    private String hora;
    private List<ItemCarrinho> carrinhoList = new ArrayList<>();

    public Carrinho() {
    }

    public Carrinho(String data, String hora, List<ItemCarrinho> carrinhoList) {
        this.data = data;
        this.hora = hora;
        this.carrinhoList = carrinhoList;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrinho_id", columnDefinition = "integer", length = 11)
    public int getId() {
        return id;
    }

    @Column(name = "carrinho_data")
    public String getData() {
        return data;
    }

    @Column(name = "carrinho_hora")
    public String getHora() {
        return hora;
    }

    @OneToMany (cascade = CascadeType.PERSIST)
    public List<ItemCarrinho> getCarrinhoList() {
        return carrinhoList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCarrinhoList(List<ItemCarrinho> carrinhoList) {
        this.carrinhoList = carrinhoList;
    }

    public void adicionarItem(ItemCarrinho itemCarrinho){
        carrinhoList.add(itemCarrinho);
    }

    public void limparCarrinho(){
        carrinhoList.clear();
    }


}
