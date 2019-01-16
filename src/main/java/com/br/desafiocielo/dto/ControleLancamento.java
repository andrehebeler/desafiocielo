package com.br.desafiocielo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode 
@ToString
public class ControleLancamento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	
	private String dataEfetivaLancamento;
	
	private String dataLancamentoContaCorrenteCliente;
	
	private Long numeroEvento;
	
	private String descricaoGrupoPagamento;
	
	private String codigoIdentificadorUnico;
	
	private String nomeBanco;
	
	private Integer quantidadeLancamentoRemessa;
	
	private String numeroRaizCNPJ;
	
	private String numeroSufixoCNPJ;
	
	private Double valorLancamentoRemessa;
	
	private Date dateLancamentoContaCorrenteCliente;
	
	private Date dateEfetivaLancamento;
 
}
