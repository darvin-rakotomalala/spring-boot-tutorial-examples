package com.poc.donnee.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BeneficiaireVillageDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String personneNom;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String personneGenre;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String district;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String commune;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String codeFkt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String villageNom;

    public String getPersonneNom() {
        return personneNom;
    }

    public void setPersonneNom(String personneNom) {
        this.personneNom = personneNom;
    }

    public String getPersonneGenre() {
        return personneGenre;
    }

    public void setPersonneGenre(String personneGenre) {
        this.personneGenre = personneGenre;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getCodeFkt() {
        return codeFkt;
    }

    public void setCodeFkt(String codeFkt) {
        this.codeFkt = codeFkt;
    }

    public String getVillageNom() {
        return villageNom;
    }

    public void setVillageNom(String villageNom) {
        this.villageNom = villageNom;
    }
}
