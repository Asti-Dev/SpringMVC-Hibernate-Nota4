package isil.ejemplo.juan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import isil.ejemplo.juan.dao.ReservaDAO;
import isil.ejemplo.juan.model.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService{
	
	private ReservaDAO reservaDAO;

	@Autowired
	public void setReservaDAO(ReservaDAO reservaDAO) {
		this.reservaDAO = reservaDAO;
	}

	@Override
	@Transactional
	public void addReserva(Reserva r) {
		this.reservaDAO.addReserva(r);
	}

	@Override
	@Transactional
	public void updateReserva(Reserva r) {
		this.reservaDAO.updateReserva(r);
	}

	@Override
	@Transactional
	public List<Reserva> listReservas() {
		return this.reservaDAO.listReservas();
	}

	@Override
	@Transactional
	public Reserva getReservaById(int id) {
		return this.reservaDAO.getReservaById(id);
	}

	@Override
	@Transactional
	public void removeReserva(int id) {
		this.reservaDAO.removeReserva(id);
	}

}
