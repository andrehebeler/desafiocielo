package com.br.desafiocielo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.desafiocielo.dto.LancamentosContaDTO;
import com.br.desafiocielo.service.DesafioCieloService;

@RestController
@RequestMapping("v1")
public class DesafioCieloController {
	
	@Autowired
	private DesafioCieloService desafioCieloService;
	
	@RequestMapping(value = "/lancamentos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  LancamentosContaDTO buscaLancamentosConta() {
		return desafioCieloService.buscaLancamentosConta();
	}
}
