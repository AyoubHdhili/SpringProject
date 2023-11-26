package tn.esprit.com.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.foyer.entities.Etudiant;
import tn.esprit.com.foyer.services.EtudiantServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    EtudiantServices etudiantService;
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getAllEtudiants(){
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }

    @PutMapping("/affecter-etudiant-reservation/{name}/{prenom}/{id}")
    public Etudiant affecterEtudiantAReservation(@PathVariable(name="name") String nameEt, @PathVariable(name = "prenom") String prenomEt, @PathVariable(name = "id") String idReservation){
         return etudiantService.affecterEtudiantAReservation(nameEt, prenomEt, idReservation);
    }
}
