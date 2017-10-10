package br.com.ilovebeer.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "fornecedor")
public class Fornecedor extends Usuario {

    private String cnpj;

    @Column(name = "fornecedor_cpf", length = 13)
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fornecedor_id", columnDefinition = "integer", length = 11)
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Column(name = "fornecedor_nome", nullable = true, length = 50)
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Column(name = "fornecedor_login", nullable = true, length = 50)
    @Override
    public String getLogin() {
        return super.getLogin();
    }

    @Override
    public void setLogin(String login) {
        super.setLogin(login);
    }

    @Column(name = "fornecedor_senha", nullable = true, length = 50)
    @Override
    public String getSenha() {
        return super.getSenha();
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
    }

    @Embedded
    @Override
    public Endereco getEndereco() {
        return super.getEndereco();
    }

    @Override
    public void setEndereco(Endereco endereco) {
        super.setEndereco(endereco);
    }
}
