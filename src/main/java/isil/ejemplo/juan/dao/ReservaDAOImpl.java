package isil.ejemplo.juan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import isil.ejemplo.juan.model.Reserva;

@Repository
public class ReservaDAOImpl implements ReservaDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(ReservaDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addReserva(Reserva r) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(r);
		logger.info("Reserva agendada correctamente, Detalles de Reserva="+r);
	}

	@Override
	public void updateReserva(Reserva r) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(r);
		logger.info("Reserva actualizada correctamente, Detalles de Reserva="+r);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> listReservas() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Reserva> reservasList = session.createQuery("from Reserva").list();
		for(Reserva r : reservasList){
			logger.info("Reserva List::"+r);
		}
		return reservasList;
	}

	@Override
	public Reserva getReservaById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Reserva r = (Reserva) session.load(Reserva.class, new Integer(id));
		logger.info("Reserva cargo correctamete, detalles de Reserva="+r);
		return r;
	}

	@Override
	public void removeReserva(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Reserva r = (Reserva) session.load(Reserva.class, new Integer(id));
		if(null != r){
			session.delete(r);
		}
		logger.info("Reserva borrada correctamente, detalles de Reserva="+r);
	}

}
