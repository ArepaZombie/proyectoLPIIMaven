package controlador;

import modelo.TblEmpleado;
import dao.CrudEmpleadoImp;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EmpleadoControlador
 */
public class EmpleadoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadoControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		  //Recuperamos el lsitado
		  CrudEmpleadoImp crud=new CrudEmpleadoImp();
		  List<TblEmpleado> listado = crud.ListadoEmpleado();
		  request.setAttribute("listado", listado);
		
		request.getRequestDispatcher("/CrudEmpleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recuperamos los valores del formulario...

		  String nombre=request.getParameter("nombre");
		  String apellido=request.getParameter("apellido");
		  String sexo=request.getParameter("sexo");
		  String email=request.getParameter("email");
		  String fecha=request.getParameter("fecha");
		  String telef=request.getParameter("telefono");
		  String dni=request.getParameter("dni");

		  //realizamos las rescpectivas instancias.

		  TblEmpleado tblemp=new TblEmpleado();
		  CrudEmpleadoImp crud=new CrudEmpleadoImp();
		  //convertir fecha a sql...

		  Date fec=new Date();
		  Date fechsql=new Date(fec.getTime());
		  //asignamos valores...

		  tblemp.setNombre(nombre);
		  tblemp.setApellido(apellido);
		  tblemp.setSexo(sexo);
		  tblemp.setEmail(email);
		  tblemp.setFechanac(fechsql);
		  tblemp.setTel(telef);
		  tblemp.setDni(dni);
		  
		  //invocamos al metodo registrar..
		  crud.RegistrarEmpleado(tblemp);
		  
		  //Recuperamos el lsitado
		  List<TblEmpleado> listado = crud.ListadoEmpleado();
		  request.setAttribute("listado", listado);
		  
		  //redireccionamos 
		 request.getRequestDispatcher("/CrudEmpleado.jsp").forward(request, response);
	}

}
