package br.com.ilovebeer.controller;

import java.util.List;

public interface InterfaceControl<E> {

    void salvar(E e);

    void atualizar(E e);

    void remover(E e, int id);

    List exibir(E e);

}

