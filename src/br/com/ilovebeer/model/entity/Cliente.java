package br.com.ilovebeer.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {

    private String cpf;

    @Column(name = "cliente_cpf", length = 13)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", columnDefinition = "integer", length = 11)
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Column(name = "cliente_nome", nullable = true, length = 50)
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Column(name = "cliente_login", nullable = true, length = 50)
    @Override
    public String getLogin() {
        return super.getLogin();
    }

    @Override
    public void setLogin(String login) {
        super.setLogin(login);
    }

    @Column(name = "cliente_senha", nullable = true, length = 50)
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
