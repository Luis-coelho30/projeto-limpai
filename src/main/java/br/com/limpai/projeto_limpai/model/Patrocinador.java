package br.com.limpai.projeto_limpai.model;

import br.com.limpai.projeto_limpai.types.UsuarioEnum;

import java.util.Objects;

public class Patrocinador extends Usuario {

    private Long patrocinadorId;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    public Patrocinador() {
    }

    public Patrocinador(Long usuario_id, String email, String senha, String telefone, UsuarioEnum tipoUsuario, Long patrocinadorId,
                        String razaoSocial, String nomeFantasia, String cnpj) {
        super(usuario_id, email, senha, telefone, tipoUsuario);
        this.patrocinadorId = patrocinadorId;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public Long getPatrocinadorId() {
        return patrocinadorId;
    }

    public void setPatrocinadorId(Long patrocinadorId) {
        this.patrocinadorId = patrocinadorId;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patrocinador patrocinador = (Patrocinador) o;
        return Objects.equals(patrocinadorId, patrocinador.patrocinadorId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(patrocinadorId);
    }
}
