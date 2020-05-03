package com.uca.capas.modelo.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Size(min = 12, max = 12, message = "El codigo debe tener 12 digitos")
	String codigo;
	
	@Size(min = 1, max = 100, message = "el nombre debe tener de uno a cien caracteres")
	String nombre;
	
	@Size(min = 1, max = 100, message = "la marca debe tener de uno a cien caracteres")
	String marca;
	
	@Size(min = 1, max = 500, message = "la descripcion debe tener de uno a quinientos caracteres")
	String descripcion;
	
	@NotNull(message = "Debe ingresar una cantidad")
	Integer existencias;
	
	@Pattern(regexp = "^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.](0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}|29[- /.]02[- /.](\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][048]|[1359][26])00))$", message = "La fecha debe ser ingresada de esta manera: dd/mm/yyyy")
	String fechaIngreso;

}
