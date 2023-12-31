package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

import interfaces.Iempleadoable;
import modelo.TblEmpleado;

public class CrudEmpleadoImp implements Iempleadoable {

	@Override
	public void RegistrarEmpleado(TblEmpleado empleado) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("ProyectoLPIISabado");
		EntityManager emanager = factory.createEntityManager();
		
		emanager.getTransaction().begin();
		
		emanager.persist(empleado);
		
		emanager.getTransaction().commit();
		
		emanager.close();
	}

	@Override
	public void ActualizarEmpleado(TblEmpleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EliminarEmpleado(TblEmpleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TblEmpleado> ListadoEmpleado() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("ProyectoLPIISabado");
		EntityManager emanager = factory.createEntityManager();
		emanager.getTransaction().begin();
		
		List<TblEmpleado> listado=emanager.createQuery("select e from TblEmpleado e",TblEmpleado.class).getResultList();
		
		emanager.getTransaction().commit();
		emanager.close();
		
		return listado;
	}

	@Override
	public TblEmpleado BuscarEmpleado(TblEmpleado empleado) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("ProyectoLPIISabado");
		EntityManager emanager = factory.createEntityManager();
		emanager.getTransaction().begin();
		
		
		
		emanager.getTransaction().commit();
		emanager.close();
		
		
		return null;
	}

}
