package br.com.limpai.projeto_limpai.model;

import br.com.limpai.projeto_limpai.types.UsuarioEnum;

import java.time.LocalDateTime;
import java.util.Objects;

public class Voluntario extends Usuario {

    private Long voluntarioId;
    private String nome;
    private String cpf;
    private LocalDateTime dataNascimento;

    public Voluntario() {
    }

    public Voluntario(Long usuario_id, String email, String senha, String telefone, UsuarioEnum tipoUsuario,
                      Long voluntarioId, String nome, String cpf, LocalDateTime dataNascimento) {
        super(usuario_id, email, senha, telefone, tipoUsuario);
        this.voluntarioId = voluntarioId;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Long getVoluntarioId() {
        return voluntarioId;
    }

    public void setVoluntarioId(Long voluntarioId) {
        this.voluntarioId = voluntarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Voluntario voluntario = (Voluntario) o;
        return Objects.equals(voluntarioId, voluntario.voluntarioId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(voluntarioId);
    }
}
