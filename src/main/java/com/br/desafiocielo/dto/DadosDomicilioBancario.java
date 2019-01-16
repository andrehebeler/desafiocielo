package com.br.desafiocielo.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode 
@ToString
public class DadosDomicilioBancario  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer codigoBanco;
	
	private Integer numeroAgencia;
	
	private String numeroContaCorrente;

}
