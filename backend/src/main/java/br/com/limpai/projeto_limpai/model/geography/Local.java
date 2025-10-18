package br.com.limpai.projeto_limpai.model.geography;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("local")
public class Local {

    @Id
    @Column("local_id")
    private Long localId;
    @Column("nome")
    private String nome;
    @Column("endereco")
    private String endereco;
    @Column("cep")
    private String cep;
    @Column("cidade_id")
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
