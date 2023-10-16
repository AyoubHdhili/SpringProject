package tn.esprit.com.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.foyer.services.UniversiteServices;

@RestController
@AllArgsConstructor
public class UniversiteController {
    UniversiteServices universiteServices;
}
