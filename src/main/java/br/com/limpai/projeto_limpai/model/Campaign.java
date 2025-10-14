package br.com.limpai.projeto_limpai.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long campanhaId;

    private String nome;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private BigDecimal metaFundos = BigDecimal.ZERO;
    private BigDecimal fundosArrecadados = BigDecimal.ZERO;

    @JoinColumn
    @ManyToOne
    private Long localId;

    public Campaign() {
    }

    public Campaign(Long campanhaId, String nome, String descricao, LocalDateTime dataInicio, LocalDateTime dataFim, BigDecimal metaFundos, BigDecimal fundosArrecadados, Long localId) {
        this.campanhaId = campanhaId;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.metaFundos = metaFundos;
        this.fundosArrecadados = fundosArrecadados;
        this.localId = localId;
    }

    public Long getCampanhaId() {
        return campanhaId;
    }

    public void setCampanhaId(Long campanhaId) {
        this.campanhaId = campanhaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public BigDecimal getMetaFundos() {
        return metaFundos;
    }

    public void setMetaFundos(BigDecimal metaFundos) {
        this.metaFundos = metaFundos;
    }

    public BigDecimal getFundosArrecadados() {
        return fundosArrecadados;
    }

    public void setFundosArrecadados(BigDecimal fundosArrecadados) {
        this.fundosArrecadados = fundosArrecadados;
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Campaign campaign = (Campaign) o;
        return Objects.equals(campanhaId, campaign.campanhaId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(campanhaId);
    }
}
