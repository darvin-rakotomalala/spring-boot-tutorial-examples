package com.poc.service.metier;

import com.poc.donnee.dto.BeneficiaireVillageDto;
import com.poc.service.repository.BeneficiaireVillageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BeneficiaireSMImpl implements BeneficiaireSM {

    private BeneficiaireVillageRepository beneficiaireVillageRepository;

    public BeneficiaireSMImpl(BeneficiaireVillageRepository beneficiaireVillageRepository) {
        this.beneficiaireVillageRepository = beneficiaireVillageRepository;
    }

    @Override
    public List<BeneficiaireVillageDto> getInstances() {
        List<BeneficiaireVillageDto> list = new ArrayList<>();
        List<String> benVil = beneficiaireVillageRepository.fetchBeneficairesVillageData();
        System.out.println(benVil.size());

        for (int i = 0; i < benVil.size(); i++) {
            String[] temp = benVil.get(i).split(",");

            BeneficiaireVillageDto result = new BeneficiaireVillageDto();
            result.setPersonneNom(temp[0]);
            result.setPersonneGenre(temp[1]);
            result.setDistrict(temp[2]);
            result.setCommune(temp[3]);
            result.setCodeFkt(temp[4]);
            result.setVillageNom(temp[5]);
            list.add(result);
        }
        return list;
    }
}
