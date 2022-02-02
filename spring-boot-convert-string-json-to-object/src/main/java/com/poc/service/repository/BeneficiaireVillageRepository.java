package com.poc.service.repository;

import com.poc.donnee.domain.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BeneficiaireVillageRepository extends JpaRepository<Personne, Long> {

    // Liste des beneficaires par village
    @Query(value = "SELECT personne_nom, personne_genre, district, commune, code_fkt, village_nom FROM beneficiaire_village", nativeQuery = true)
    List<String> fetchBeneficairesVillageData();
}
