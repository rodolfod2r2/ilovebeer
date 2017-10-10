package br.com.ilovebeer.view;

import br.com.ilovebeer.controller.*;
import br.com.ilovebeer.model.entity.*;

public class Main {

    public static void main(String[] args) {

        //Criando um Cliente sem Polimorfismo;
        Cliente cliente = new Cliente();
        cliente.setNome("AR");
        cliente.setCpf("11111111111");
        cliente.setLogin("teste");
        cliente.setSenha("teste");

        //Criando um Endereço para Cliente;
        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setLogradouro("A");
        enderecoCliente.setBairro("B");
        enderecoCliente.setCidade("C");
        enderecoCliente.setEstado("D");
        enderecoCliente.setNumero("121");
        //Setando o Endereço no Cliente;
        cliente.setEndereco(enderecoCliente);

        //Instanciando o Controller do Cliente;
        ControllerCliente controllerCliente = new ControllerCliente();
        controllerCliente.salvar(cliente);

        //Criando um Fornecedor sem Polimorfismo;
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Kaos");
        fornecedor.setCnpj("9999999999");
        fornecedor.setLogin("fornecedor");
        fornecedor.setSenha("123456");

        //Criando um Endereço para Fornecedor;
        Endereco enderecoFornecedor = new Endereco();
        enderecoFornecedor.setLogradouro("A");
        enderecoFornecedor.setBairro("B");
        enderecoFornecedor.setCidade("C");
        enderecoFornecedor.setEstado("D");
        enderecoFornecedor.setNumero("121");
        //Setando o Endereço no Fornecedor;
        fornecedor.setEndereco(enderecoFornecedor);

        //Instanciando o Controller do Cliente;
        ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
        controllerFornecedor.salvar(fornecedor);

        //Criando um Produto;
        Produto produto = new Produto();
        produto.setNome("Cerveja Nova");
        produto.setPreco(8.00);
        produto.setQtdEstoque(500.00);

        //Instanciando o Controller do Produto;
        ControllerProduto controllerProduto = new ControllerProduto();
        controllerProduto.salvar(produto);


        //Criando um Venda;
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho(new Produto("Cerveja Antartica B", 8.00, fornecedor, 500), 12.));
        carrinho.adicionarItem(new ItemCarrinho(new Produto("Cerveja Nova Skin", 6.00, fornecedor, 500), 22));
        carrinho.adicionarItem(new ItemCarrinho(new Produto("Cerveja Itaipava", 6.00, fornecedor, 500), 52));
        carrinho = new Carrinho("17/07/2017", cliente,  carrinho.getCarrinhoList());

        //Instanciando o Controller de Venda;
        ControllerCarrinho controllerVenda = new ControllerCarrinho();
        controllerVenda.salvar(carrinho);

        //Instanciando o Controller de ItemCarrinho;

        int i = 0;
        for (ItemCarrinho vp : carrinho.getCarrinhoList()){
            ControllerItemCarrinho controllerItemCarrinho = new ControllerItemCarrinho();
            controllerItemCarrinho.salvar(carrinho.getCarrinhoList().get(i));
            i++;
        }

    }
}
