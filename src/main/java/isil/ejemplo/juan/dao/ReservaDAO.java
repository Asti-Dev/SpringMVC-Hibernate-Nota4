package isil.ejemplo.juan.dao;

import java.util.List;
import isil.ejemplo.juan.model.Reserva;

public interface ReservaDAO {

	public  void addReserva(Reserva r);
	public void updateReserva(Reserva r);
	public List<Reserva> listReservas();
	public Reserva getReservaById(int id);
	public void removeReserva(int id);
}
