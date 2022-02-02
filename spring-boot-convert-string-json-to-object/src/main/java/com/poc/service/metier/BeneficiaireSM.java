package com.poc.service.metier;

import com.poc.donnee.dto.BeneficiaireVillageDto;

import java.util.List;

public interface BeneficiaireSM {
    List<BeneficiaireVillageDto> getInstances();
}
