package controlador;

import modelo.TblEmpleado;
import dao.CrudEmpleadoImp;

import java.io.IOException;
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TblEmpleado tblep=new TblEmpleado();
		CrudEmpleadoImp crud=new CrudEmpleadoImp();
		
		/*
		//Damos valores	
		tblep.setNombre("Juanote");
		tblep.setApellido("Torres Mora");
		tblep.setSexo("m");
		tblep.setEmail("bettyteamo@hotmail.com");
		*/
		
		crud.RegistrarEmpleado(tblep);
		doGet(request, response);
	}

}
