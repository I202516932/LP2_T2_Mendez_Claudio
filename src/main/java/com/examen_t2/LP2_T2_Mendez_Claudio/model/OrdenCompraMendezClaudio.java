package com.examen_t2.LP2_T2_Mendez_Claudio.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_orden_compra")
@Data
public class OrdenCompraMendezClaudio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_orden")
	private Integer nroOrden;

	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private ProveedorMendezClaudio proveedor;

	private BigDecimal monto;

	@Column(name = "direccion_entrega")
	private String direccionEntrega;

	@Column(name = "fecha_entrega")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate fechaEntrega;

	private String estado = "P";

	public String getEstadoDescripcion() {
		if (estado == null)
			return "";
		return switch (estado) {
		case "P" -> "Pendiente";
		case "C" -> "Completado";
		case "A" -> "Anulado";
		default -> estado;
		};
	}
}