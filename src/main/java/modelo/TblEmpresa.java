package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_empresa database table.
 * 
 */
@Entity
@Table(name="tbl_empresa")
@NamedQuery(name="TblEmpresa.findAll", query="SELECT t FROM TblEmpresa t")
public class TblEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idempresa;

	private String descrip;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechacrea;

	private String nomcomer;

	private String rzsocial;

	private String telef;

	//bi-directional many-to-one association to TblCategoria
	@ManyToOne
	@JoinColumn(name="idcategoria")
	private TblCategoria tblCategoria;

	public TblEmpresa() {
	}

	public int getIdempresa() {
		return this.idempresa;
	}

	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechacrea() {
		return this.fechacrea;
	}

	public void setFechacrea(Date fechacrea) {
		this.fechacrea = fechacrea;
	}

	public String getNomcomer() {
		return this.nomcomer;
	}

	public void setNomcomer(String nomcomer) {
		this.nomcomer = nomcomer;
	}

	public String getRzsocial() {
		return this.rzsocial;
	}

	public void setRzsocial(String rzsocial) {
		this.rzsocial = rzsocial;
	}

	public String getTelef() {
		return this.telef;
	}

	public void setTelef(String telef) {
		this.telef = telef;
	}

	public TblCategoria getTblCategoria() {
		return this.tblCategoria;
	}

	public void setTblCategoria(TblCategoria tblCategoria) {
		this.tblCategoria = tblCategoria;
	}

}