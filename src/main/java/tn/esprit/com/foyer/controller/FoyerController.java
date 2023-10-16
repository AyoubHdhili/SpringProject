package tn.esprit.com.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.foyer.services.FoyerServices;

@RestController
@AllArgsConstructor
public class FoyerController {
    FoyerServices foyerServices;
}
