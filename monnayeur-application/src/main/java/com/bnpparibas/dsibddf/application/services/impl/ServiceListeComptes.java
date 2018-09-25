/**
 * 
 */
package com.bnpparibas.dsibddf.application.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.IListesComptesGoal;
import com.bnpparibas.dsibddf.application.services.IserviceListeComptes;
import com.bnpparibas.dsibddf.domain.entities.DemandeListeComptes;
import com.bnpparibas.dsibddf.domain.entities.ListeComptes;

/**
 * @author ADMINIBM
 *
 */
@Service
public class ServiceListeComptes implements IserviceListeComptes {

    @Autowired
 	private IListesComptesGoal serviceComptesGoal;

	@Override
	public ListeComptes getListeComptes(String pan) {
      DemandeListeComptes data= new DemandeListeComptes();
		
      data.setIdAtm("kmjslkhj");
      data.setPan("kuysiydsqh");
		return serviceComptesGoal.getListeComptes(pan);
	}

	/**
	 * @return the serviceComptesGoal
	 */
	public IListesComptesGoal getServiceComptesGoal() {
		return serviceComptesGoal;
	}

	/**
	 * @param serviceComptesGoal the serviceComptesGoal to set
	 */
	public void setServiceComptesGoal(IListesComptesGoal serviceComptesGoal) {
		this.serviceComptesGoal = serviceComptesGoal;
	}

}
