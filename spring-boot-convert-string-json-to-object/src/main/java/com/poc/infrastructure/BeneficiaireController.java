package com.poc.infrastructure;

import com.poc.donnee.dto.BeneficiaireVillageDto;
import com.poc.service.metier.BeneficiaireSM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class BeneficiaireController {

    @Autowired
    private BeneficiaireSM beneficiaireSM;

    @GetMapping("/benVillage")
    public List<BeneficiaireVillageDto> getBenVil() {
        return beneficiaireSM.getInstances();
    }
}
