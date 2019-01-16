package com.br.desafiocielo.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode 
@ToString
public class LancamentosContaDTO  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private TotalControleLancamento totalControleLancamento;
	
	private List<ControleLancamento> listaControleLancamento;
	
	private Integer indice;
	
	private Integer tamanhoPagina;
	
	private Integer totalElements;
	
	private Boolean erro;
	
	private String mensagem;
	
}
