package br.com.limpai.projeto_limpai.model;

import java.util.Objects;

public class Local {

    private Long localId;
    private String nome;
    private String endereco;
    private String cep;
    private Cidade cidade;

    public Local() {
    }

    public Local(Long localId, String nome, String endereco, String cep, Cidade cidade) {
        this.localId = localId;
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return Objects.equals(localId, local.localId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(localId);
    }
}
