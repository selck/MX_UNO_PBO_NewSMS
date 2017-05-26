package mx.com.amx.unotv.newsms.dto;

public class EstadoDTO {
	
	private String idEstado;
	private String friendlyURL;
	private String utm;
	
	/**
	 * @return el idEstado
	 */
	public String getIdEstado() {
		return idEstado;
	}
	/**
	 * @param idEstado el idEstado a establecer
	 */
	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}
	/**
	 * @return el friendlyURL
	 */
	public String getFriendlyURL() {
		return friendlyURL;
	}
	/**
	 * @param friendlyURL el friendlyURL a establecer
	 */
	public void setFriendlyURL(String friendlyURL) {
		this.friendlyURL = friendlyURL;
	}
	/**
	 * @return el utm
	 */
	public String getUtm() {
		return utm;
	}
	/**
	 * @param utm el utm a establecer
	 */
	public void setUtm(String utm) {
		this.utm = utm;
	}
	
	
	
	//cada q se generé el json de los banners, se guarde la versión en la bd
}
