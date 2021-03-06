/**
 * utilitario.mensajes.consultas.CreditosAsignadosOV.java
 */
package utilitario.mensajes.consultas;

import java.io.Serializable;

import utilitario.mensajes.comun.ObjetoValor;

/**
 * The Class CreditosAsignadosOV.
 *
 * @author ISC Omar Cruz Carrillo (ocruzc) 14/09/2012
 * @version 1.0
 */
public class CreditosAsignadosOV extends ObjetoValor implements Serializable {

	/**
	 * Instancia una nueva creditos asignados ov.
	 */
	public CreditosAsignadosOV() {
	}
	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 4186531143367799683L;

	/** The contrato. */
	private java.lang.String 	contrato;

	/** The contrato ld. */
	private java.lang.String 	contratoLD;

	/** The codigo grupo. */
	private java.lang.String 	codigoGrupo;

	/** The nombre grupo. */
	private java.lang.String 	nombreGrupo;

	/** The monto. */
	private java.lang.Double 	monto;

	/** The integrantes. */
	private java.lang.Integer 	integrantes;

	/**
	 * M�todo que regresa el valor del mi�mbro dato contrato.
	 * @return the contrato
	 */
	public String getContrato() {
		return contrato;
	}
	/**
	 * M�todo que establece el valor para el mi�mbro dato contrato.
	 * @param contrato the contrato to set
	 */
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	/**
	 * M�todo que regresa el valor del mi�mbro dato contratoLD.
	 * @return the contratoLD
	 */
	public String getContratoLD() {
		return contratoLD;
	}
	/**
	 * M�todo que establece el valor para el mi�mbro dato contratoLD.
	 * @param contratoLD the contratoLD to set
	 */
	public void setContratoLD(String contratoLD) {
		this.contratoLD = contratoLD;
	}
	/**
	 * M�todo que regresa el valor del mi�mbro dato codigoGrupo.
	 * @return the codigoGrupo
	 */
	public String getCodigoGrupo() {
		return codigoGrupo;
	}
	/**
	 * M�todo que establece el valor para el mi�mbro dato codigoGrupo.
	 * @param codigoGrupo the codigoGrupo to set
	 */
	public void setCodigoGrupo(String codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
	/**
	 * M�todo que regresa el valor del mi�mbro dato nombreGrupo.
	 * @return the nombreGrupo
	 */
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	/**
	 * M�todo que establece el valor para el mi�mbro dato nombreGrupo.
	 * @param nombreGrupo the nombreGrupo to set
	 */
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	/**
	 * Obtiene monto.
	 *
	 * @return the monto
	 */
	public java.lang.Double getMonto() {
		return monto;
	}

	/**
	 * Establece monto.
	 *
	 * @param monto the monto to set
	 */
	public void setMonto(java.lang.Double monto) {
		this.monto = monto;
	}

	/**
	 * Obtiene integrantes.
	 *
	 * @return the integrantes
	 */
	public java.lang.Integer getIntegrantes() {
		return integrantes;
	}

	/**
	 * Establece integrantes.
	 *
	 * @param integrantes the integrantes to set
	 */
	public void setIntegrantes(java.lang.Integer integrantes) {
		this.integrantes = integrantes;
	}
}
