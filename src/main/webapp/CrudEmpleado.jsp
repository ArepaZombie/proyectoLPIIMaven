
<%@page import="java.util.*" %>
<%@page import="modelo.TblEmpleado" %>

<html>
<body bgcolor="#c5dec9">
<h3><a href="index.jsp">Volver</a></h3>
<h2 align="center" >Registrar Empleado</h2>

<form method="post" action="EmpleadoControlador">
<table border="2" align="center">

<!-- ---------------- -->
<tr>
	<td>Nombre:</td>
	<td><input type="text" name="nombre"></td>
</tr>

<!-- ---------------- -->
<tr>
	<td>Apellidos:</td>
	<td><input type="text" name="apellido"></td>
</tr>

<!-- ---------------- -->
<tr>
	<td colspan="2" align="center">
	<select name="sexo" >
		<option>Seleccione sexo</option>
		<option>M</option>
		<option>F</option>
	</select>
	</td>
</tr>

<!-- ---------------- -->
<tr>
	<td>Dni:</td>
	<td><input type="text" name="dni"></td>
</tr>

<!-- ---------------- -->
<tr>
	<td>Email:</td>
	<td><input type="text" name="email"></td>
</tr>

<!-- ---------------- -->
<tr>
	<td>Fecha Nac.:</td>
	<td><input type="date" name="fecha"></td>
</tr>

<!-- ---------------- -->
<tr>
	<td>Telefono:</td>
	<td><input type="text" name="telefono"></td>
</tr>

<!-- ---------------- -->
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="Registrar">
	</td>
</tr>

</table>
</form>

<h2 align="center"> Lista de Empleados</h2>

<table align="center" border="2">

	<tr>
		<th>Codigo</th>
		<th>Nombre</th>
		<th>Apellido</th>
		<th>Sexo</th>
		<th>Email</th>
		<th>Fecha</th>
		<th>Telefono</th>
		<th>Dni</th>
	</tr>
<%
List<TblEmpleado> listado = (List<TblEmpleado>)request.getAttribute("listado");
if(listado!=null){
	for(TblEmpleado empleado:listado){
		%>
	<tr>
		<td><%=empleado.getIdempleado() %> </td>
		<td><%=empleado.getNombre() %> </td>
		<td><%=empleado.getApellido() %> </td>
		<td><%=empleado.getSexo() %> </td>
		<td><%=empleado.getEmail() %> </td>
		<td><%=empleado.getFechanac() %> </td>
		<td><%=empleado.getTel() %> </td>
		<td><%=empleado.getDni() %> </td>
	</tr>
		<% 
	}
}
%>
</table>


</body>
</html>
