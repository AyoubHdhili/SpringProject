package tn.esprit.com.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.foyer.services.BlocServices;

@RestController
@AllArgsConstructor
public class BlocController {
    BlocServices blocServices;
}
