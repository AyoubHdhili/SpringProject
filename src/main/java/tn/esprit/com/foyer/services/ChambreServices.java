package tn.esprit.com.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.com.foyer.entities.Bloc;
import tn.esprit.com.foyer.entities.Chambre;
import tn.esprit.com.foyer.repositories.BlocRepository;
import tn.esprit.com.foyer.repositories.ChambreRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChambreServices implements IChambreService{
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;

    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
    public Bloc affecterChambresABloc (List<Long> numChambre, String nomBloc){
        Bloc b = blocRepository.findByNomBloc(nomBloc);
        for (int i = 0; i < numChambre.size(); i++){
            Chambre ch = chambreRepository.findById(numChambre.get(i)).get();
            ch.setBloc(b);
            chambreRepository.save(ch);
        }
        return b;
    }
}
