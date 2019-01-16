package com.br.desafiocielo.service.impl;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.br.desafiocielo.dto.LancamentosContaDTO;
import com.br.desafiocielo.service.DesafioCieloService;

@Service
public class DesafioCieloServiceImpl implements DesafioCieloService {
	
	private static final String SERVICE_URL = "http://localhost:8001/v1/lancamentos";

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RestTemplate rest;

	private HttpHeaders getHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

	@Override
	public LancamentosContaDTO buscaLancamentosConta() {
		LancamentosContaDTO lancamentos = new LancamentosContaDTO();
		try {
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(SERVICE_URL);
			URI urlFormatterd = builder.build().encode().toUri();
			HttpHeaders headers = this.getHttpHeaders();
	
			HttpEntity<String> entity = new HttpEntity<>(headers);
			ResponseEntity<LancamentosContaDTO> responseEntity = rest.exchange(urlFormatterd, HttpMethod.GET, entity, LancamentosContaDTO.class);
			lancamentos = responseEntity.getBody();
		} catch(Exception e) {
			logger.error("ERRO AO RECUPERAR INFORMACOES DE LANCAMENTOS - {}", e.getMessage());
			lancamentos.setErro(true);
			lancamentos.setMensagem("Ocorreu um erro ao buscar lançaamentos, por favor contacte o administrador do sistema");
		}
		return lancamentos;
	}

}
