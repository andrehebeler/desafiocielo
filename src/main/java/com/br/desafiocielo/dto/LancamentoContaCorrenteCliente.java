package com.br.desafiocielo.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode 
@ToString
public class LancamentoContaCorrenteCliente  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long numeroRemessaBanco;
	
	private String nomeSituacaoRemessa;
	
	private DadosDomicilioBancario dadosDomicilioBancario;
	
	private String nomeTipoOperacao;

}
