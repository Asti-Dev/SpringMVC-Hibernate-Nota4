package isil.ejemplo.juan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="reserva")
public class Reserva {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nombre_persona;
	
	private int cant_persona;
	
	private int cant_cuarto;
	
	private String tipo_cuarto;
	
	private DateTimeFormat fech_reserva;
	
	private Date fech_ingreso;

	private Date fech_salida;
	
	private double costo_total;
	
	private String tipo_pago;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_persona() {
		return nombre_persona;
	}

	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}

	public int getCant_persona() {
		return cant_persona;
	}

	public void setCant_persona(int cant_persona) {
		this.cant_persona = cant_persona;
	}

	public int getCant_cuarto() {
		return cant_cuarto;
	}

	public void setCant_cuarto(int cant_cuarto) {
		this.cant_cuarto = cant_cuarto;
	}

	public String getTipo_cuarto() {
		return tipo_cuarto;
	}

	public void setTipo_cuarto(String tipo_cuarto) {
		this.tipo_cuarto = tipo_cuarto;
	}

	public DateTimeFormat getFech_reserva() {
		return fech_reserva;
	}

	public void setFech_reserva(DateTimeFormat fech_reserva) {
		this.fech_reserva = fech_reserva;
	}

	public Date getFech_ingreso() {
		return fech_ingreso;
	}

	public void setFech_ingreso(Date fech_ingreso) {
		this.fech_ingreso = fech_ingreso;
	}

	public Date getFech_salida() {
		return fech_salida;
	}

	public void setFech_salida(Date fech_salida) {
		this.fech_salida = fech_salida;
	}

	public double getCosto_total() {
		return costo_total;
	}

	public void setCosto_total(double costo_total) {
		this.costo_total = costo_total;
	}

	public String getTipo_pago() {
		return tipo_pago;
	}

	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}
	
	@Override
	public String toString(){
		return "id="+id+", nombre_persona="+nombre_persona+", cant_persona="+cant_persona+", cant_cuarto="+cant_cuarto+
				", tipo_cuarto="+tipo_cuarto+", fech_reserva="+fech_reserva+"fech_ingreso="+fech_ingreso+
				", fech_salida="+fech_salida+", costo_total="+costo_total+", tipo_pago="+tipo_pago;
	}
	
}
