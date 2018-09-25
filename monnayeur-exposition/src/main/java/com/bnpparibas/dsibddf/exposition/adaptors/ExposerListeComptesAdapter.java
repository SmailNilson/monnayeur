/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.adaptors;

import java.util.ArrayList;
import java.util.List;

import com.bnpparibas.dsibddf.domain.entities.Compte;
import com.bnpparibas.dsibddf.domain.entities.ListeComptes;
import com.bnpparibas.dsibddf.exposition.dto.CompteDTO;
import com.bnpparibas.dsibddf.exposition.dto.ListeComptesDTO;

/**
 * @author ADMINIBM
 *
 */
public class ExposerListeComptesAdapter {
	
	

	/**
	 * 
	 */
	private ExposerListeComptesAdapter() {
		super();
	}


	public static ListeComptesDTO adapt(ListeComptes comptes) {
		ListeComptesDTO comptesDTO = new ListeComptesDTO();
		
		comptesDTO.setCodeReponse(comptes.getCodeReponse());
		comptesDTO.setIdAtm(comptes.getIdAtm());
		comptesDTO.setLibelleCodeReponse(comptes.getLibelleCodeReponse());
		comptesDTO.setPan(comptes.getPan());
		comptesDTO.setComptes(convertListeComptesToDto(comptes.getComptes()));
		
		return comptesDTO;
	}
	
	
	 /**
     * 
     */
    public static List<CompteDTO> convertListeComptesToDto(List<Compte> comptes) {

        final List<CompteDTO> listeCompteDTO = new ArrayList<>();
        for (Compte compte : comptes) {
            listeCompteDTO.add(convertCompteToDTO(compte));
        }
        return listeCompteDTO;
    }

    public static CompteDTO convertCompteToDTO(Compte compte) {

        CompteDTO compteDTO = new CompteDTO();
        compteDTO.setNumeroCompte(compte.getNumeroCompte());
        compteDTO.setPlafondCompte(compte.getPlafondCompte());
        compteDTO.setSoldeCompte(compte.getSoldeCompte());
        compteDTO.setMontantDepotMinimal(compte.getMontantDepotMinimal());
        compteDTO.setLibelleType2Compte(compte.getLibelleType2Compte());
        compteDTO.setLibelleCodeDevise(compte.getLibelleCodeDevise());
        return compteDTO;
    }
}
