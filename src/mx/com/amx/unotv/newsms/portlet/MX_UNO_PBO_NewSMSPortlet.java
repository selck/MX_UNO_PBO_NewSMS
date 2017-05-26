package mx.com.amx.unotv.newsms.portlet;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.portlet.*;

import mx.com.amx.unotv.newsms.dto.EstadoDTO;

import org.apache.log4j.Logger;

public class MX_UNO_PBO_NewSMSPortlet extends javax.portlet.GenericPortlet {
	
	private Logger logger=Logger.getLogger(MX_UNO_PBO_NewSMSPortlet.class);
	
	public void init() throws PortletException{
		super.init();
	}
	
	public void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		String redirect="/resources/jsp/newSMS.jsp";
		
		ArrayList<EstadoDTO> listEstados=new ArrayList<EstadoDTO>();
		for (int i = 1; i <= 10; i++) {
			EstadoDTO estadoDTO=new EstadoDTO();
			estadoDTO.setIdEstado("idEstado_"+i);
			estadoDTO.setFriendlyURL("friendlyURL_"+i);
			estadoDTO.setUtm("utm_"+i);
			listEstados.add(estadoDTO);
		}
		request.setAttribute("chucho", "nacho");
		request.setAttribute("listEstadosRequest", listEstados);
		
		response.setContentType(request.getResponseContentType());
		//logger.info("Redirigiendo a: "+dispatch);
		PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher(redirect);
		rd.include(request,response);
	}

	public void processAction(ActionRequest request, ActionResponse response) throws PortletException, java.io.IOException {
		
	}

}
