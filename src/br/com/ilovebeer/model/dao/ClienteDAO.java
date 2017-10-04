package br.com.ilovebeer.model.dao;

import br.com.ilovebeer.model.entity.Cliente;

public class ClienteDAO extends AbstractDAO<Cliente> {

    @Override
    public void salvarDados(Cliente cliente) {
        super.salvarDados(cliente);
    }

    @Override
    public void atualizarDados(Cliente cliente) {
        super.atualizarDados(cliente);
    }

    @Override
    public void removerDados(Cliente cliente, int id) {
        super.removerDados(cliente, id);
    }

    @Override
    public void exibirDados(Cliente cliente) {
        super.exibirDados(cliente);
    }
}
