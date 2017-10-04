package br.com.ilovebeer.controller;

public interface InterfaceControl<E> {

    void salvar(E e);
    void atualizar(E e);
    void remover(E e, int id);
    void exibir(E e);

}
