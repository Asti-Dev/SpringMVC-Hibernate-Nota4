package isil.ejemplo.juan.service;

import java.util.List;

import isil.ejemplo.juan.model.Reserva;

public interface ReservaService {

	public void addReserva(Reserva r);
	public void updateReserva(Reserva r);
	public List<Reserva> listReservas();
	public Reserva getReservaById(int id);
	public void removeReserva(int id);
	
}
