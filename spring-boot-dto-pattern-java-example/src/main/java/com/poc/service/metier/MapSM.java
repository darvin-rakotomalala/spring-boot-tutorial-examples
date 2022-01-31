package com.poc.service.metier;

import com.poc.donnee.dto.UserLocationDTO;

import java.util.List;

public interface MapSM {
    List<UserLocationDTO> getAllUsersLocation();
}
