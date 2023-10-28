package interfaces;

import java.util.List;

import modelo.TblCliente;

public interface Iclienteable {
	public void RegistrarCliente(TblCliente cliente);
	public void ActualizarCliente(TblCliente cliente);
	public void EliminarCliente(TblCliente cliente);
	public List<TblCliente> ListarCliente();
	public TblCliente BuscarCliente(TblCliente cliente);
}
