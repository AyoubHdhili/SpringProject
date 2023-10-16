package tn.esprit.com.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.com.foyer.entities.Universite;
import tn.esprit.com.foyer.repositories.UniversteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServices implements IUniversiteService{
    UniversteRepository universteRepository;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return null;
    }

    @Override
    public Universite addUniversity(Universite u) {
        return null;
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return null;
    }

    @Override
    public Universite retrieveUniversity(long idUniversite) {
        return null;
    }

    @Override
    public void removeUniversity(long idUniversity) {

    }
}
