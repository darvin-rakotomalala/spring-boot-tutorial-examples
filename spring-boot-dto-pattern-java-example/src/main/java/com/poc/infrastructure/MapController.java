package com.poc.infrastructure;

import com.poc.donnee.dto.UserLocationDTO;
import com.poc.service.metier.manually.MapManuallySM;
import com.poc.service.metier.mapstruct.MapMapStructSM;
import com.poc.service.metier.modelmapper.MapModelMapperSM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MapController {

    @Autowired
    private MapManuallySM mapSM;

    @Autowired
    private MapModelMapperSM mapModelMapperSM;

    @Autowired
    private MapMapStructSM mapMapStructSM;

    @GetMapping(value = "/mapManually")
    public List<UserLocationDTO> getAllUsersLocation() {
        return mapSM.getAllUsersLocation();
    }

    @GetMapping(value = "/mapModelMapper")
    public List<UserLocationDTO> getAllUsersLocationWithModelMapper() {
        return mapModelMapperSM.getAllUsersLocation();
    }

    @GetMapping(value = "/mapMapStruct")
    public List<UserLocationDTO> getAllUsersLocationWithMapStruct() {
        return mapMapStructSM.getAllUsersLocation();
    }
}
