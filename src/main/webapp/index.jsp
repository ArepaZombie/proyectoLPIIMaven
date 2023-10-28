<html>
<body bgcolor="#c5dec9">
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


</body>
</html>
