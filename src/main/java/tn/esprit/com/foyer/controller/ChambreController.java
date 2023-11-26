package tn.esprit.com.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.foyer.entities.Bloc;
import tn.esprit.com.foyer.entities.Chambre;
import tn.esprit.com.foyer.entities.TypeChambre;
import tn.esprit.com.foyer.services.ChambreServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    ChambreServices chambreServices;
    @GetMapping("/get-all-chambres")
    public List<Chambre> retrieveChambres(){
        return chambreServices.retrieveAllChambre();
    }
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chambreId){
        return chambreServices.retrieveChambre(chambreId);
    }
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre ch){
        return chambreServices.addChambre(ch);
    }

    @DeleteMapping("/delete-chambre/{chambre-id}")
    public void deleteChambre(@PathVariable("chambre-id") Long chambreId){
        chambreServices.removeChambre(chambreId);
    }

    @PutMapping("/affecterChambresABloc/{nom-bloc}")
    public Bloc affecterChambresABloc (@RequestBody List<Long> numChambre, @PathVariable("nom-bloc") String nomBloc){
        return chambreServices.affecterChambresABloc(numChambre,nomBloc);
    }
    @GetMapping("/getChambrebyNomBloc/{nomBloc}")
    public List<Chambre> getChambresByNomBloc(@PathVariable("nomBloc") String nomBloc){
        return chambreServices.getChambresParNomBloc(nomBloc);

    }
    @GetMapping("/getNombreChambreparTypeEtBloc/{typec}/{idbloc}")
    public Long  getnbChambre(@PathVariable("typec") TypeChambre typec, @PathVariable("idbloc") Long idbloc){
        return chambreServices.nbChambreParTypeEtBloc(typec,idbloc);

    }
}
