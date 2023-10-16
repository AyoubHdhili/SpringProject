package tn.esprit.com.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.com.foyer.repositories.UniversteRepository;

@Service
@AllArgsConstructor
public class UniversiteServices implements IUniversiteService{
    UniversteRepository universteRepository;
}
