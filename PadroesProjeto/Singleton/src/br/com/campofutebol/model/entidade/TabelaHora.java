package br.com.campofutebol.model.entidade;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Luiz Fernando on 01/01/2020.
 */
@Entity
public class TabelaHora {

	@Id
	@GeneratedValue
	private Integer codigo;
	private LocalTime horaInicio;
	private LocalTime horaFinal;

	@Deprecated
	private TabelaHora() {
	}

	public TabelaHora(LocalTime horaInicio, LocalTime horaFinal) {
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	
	public LocalTime getHoraFinal() {
		return horaFinal;
	}
}