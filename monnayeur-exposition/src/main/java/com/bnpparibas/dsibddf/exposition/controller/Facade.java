/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.controller;

import static com.bnpparibas.dsibddf.exposition.adaptors.ExposerListeComptesAdapter.adapt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bnpparibas.dsibddf.application.services.IserviceListeComptes;
import com.bnpparibas.dsibddf.domain.entities.ListeComptes;
import com.bnpparibas.dsibddf.exposition.dto.DemandeListeComptesDTO;
import com.bnpparibas.dsibddf.exposition.dto.ListeComptesDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author ADMINIBM
 *
 */
@RestController
@RequestMapping("/monnayeur")
public class Facade {

	@Autowired
	private IserviceListeComptes serviceListeComptes;

	@ApiOperation(value = "Find Liste Compte By Pan", response = ListeComptesDTO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 400, message = "Invalid Pan supplied"),
			@ApiResponse(code = 404, message = "Definition not found") })
	@RequestMapping(value = "test", method = RequestMethod.POST,consumes = MediaType.APPLICATION_ATOM_XML_VALUE)
	public ListeComptesDTO getmonnayeur(@RequestBody(required = true) final DemandeListeComptesDTO objDemande) {
		
		return adapt(getListeOfComptes(objDemande));
	}

	/**
	 * @return the serviceListeComptes
	 */
	public IserviceListeComptes getServiceListeComptes() {
		return serviceListeComptes;
	}

	/**
	 * @return
	 * @see com.bnpparibas.dsibddf.application.services.IserviceListeComptes#getListeComptes()
	 */
	public ListeComptes getListeOfComptes(final DemandeListeComptesDTO objDemande) {
		if (objDemande.getPan()!=null) {
			System.out.println("jkhlj");
		}
		return serviceListeComptes.getListeComptes(objDemande.getPan());
	}

	/**
	 * @param serviceListeComptes the serviceListeComptes to set
	 */
	public void setServiceListeComptes(IserviceListeComptes serviceListeComptes) {
		this.serviceListeComptes = serviceListeComptes;
	}
	
	
	
}
