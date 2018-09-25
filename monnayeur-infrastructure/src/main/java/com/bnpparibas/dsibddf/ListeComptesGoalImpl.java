package com.bnpparibas.dsibddf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnpparibas.dsibddf.domain.entities.Compte;
import com.bnpparibas.dsibddf.domain.entities.ListeComptes;

@Service
public class ListeComptesGoalImpl implements IListesComptesGoal {
	
	@Override
	public ListeComptes getListeComptes(String pan) {

		return getModeBouchon(pan);
	}
	
	   /**
     * Cette méthode va permettre de mis en place un bouchon qui remplace l'appel du goal
     * 
     * @param DemandeListeComptesIn
     * @return ReponseListeComptes
     */
    private ListeComptes getModeBouchon(final String pan) {

        final List<Compte> comptes = new ArrayList<>();
        final Compte compte = new Compte();
        // On renseigne l'identifiant du compte
        for (int i = 0; i < 4; i++) {
            compte.setNumeroCompte("123654789123456789451");
            // On renseigne la devise du compte
            compte.setLibelleCodeDevise("libelleType2Compte");
            // On renseigne le solde du compte
            compte.setSoldeCompte(15260.0);
            compte.setPlafondCompte(9000.0);
            compte.setMontantDepotMinimal(0);
            compte.setLibelleCodeDevise("EUR");
            comptes.add(compte);
        }
        final ListeComptes reponseListeComptes = new ListeComptes() ;
        reponseListeComptes.setPan("aaaaaaaaa");
        reponseListeComptes.setIdAtm("bbbbbbbbbbb");
        reponseListeComptes.setLibelleCodeReponse("test test test ");
        reponseListeComptes.setCodeReponse(1);
        reponseListeComptes.setComptes(comptes);
        return reponseListeComptes;
    }




}
