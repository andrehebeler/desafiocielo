package com.br.desafiocielo.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode 
@ToString
public class TotalControleLancamento  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer quantidadeLancamentos;
	
	private Integer quantidadeRemessas;
	
	private Double valorLancamentos;

}
