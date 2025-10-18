package br.com.limpai.projeto_limpai.model.geography;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("estado")
public record Estado (
        @Id
        @Column("estado_id")
        Long estadoId,
        @Column("nome")
        String nome,
        @Column("sigla")
        String sigla) { }
