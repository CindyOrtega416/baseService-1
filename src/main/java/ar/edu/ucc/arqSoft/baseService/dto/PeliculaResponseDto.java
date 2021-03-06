package ar.edu.ucc.arqSoft.baseService.dto;

import ar.edu.ucc.arqSoft.common.dto.DtoEntity;

public class PeliculaResponseDto implements DtoEntity{
	
	private String titulo;
	private Long año;
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Long getAño() {
		return año;
	}
	public void setAño(Long año) {
		this.año = año;
	}
	

}
