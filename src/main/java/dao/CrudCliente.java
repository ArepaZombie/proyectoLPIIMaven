package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Iclienteable;
import modelo.TblCliente;

public class CrudCliente implements Iclienteable {

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("ProyectoLPIISabado");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(cliente);
		
		em.getTransaction().commit();
		
		em.close();

	}

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TblCliente> ListarCliente() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("ProyectoLPIISabado");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		List<TblCliente> listado = em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
		
		em.getTransaction().commit();
		em.close();
		
		return listado;
	}

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
