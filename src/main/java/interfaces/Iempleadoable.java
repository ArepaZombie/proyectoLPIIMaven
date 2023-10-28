package interfaces;

import java.util.List;

import modelo.TblEmpleado;

public interface Iempleadoable {
	public void RegistrarEmpleado(TblEmpleado empleado);
	public void ActualizarEmpleado(TblEmpleado empleado);
	public void EliminarEmpleado(TblEmpleado empleado);
	public List<TblEmpleado> ListadoEmpleado();
	public TblEmpleado BuscarEmpleado(TblEmpleado empleado);
}
