package com.poc.infrastructure;

import com.poc.service.metier.MapSM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MapController {

    @Autowired
    private MapSM mapSM;



}
