package com.poc.service.metier;

import com.poc.donnee.dto.UserLocationDTO;
import com.poc.service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapSMImpl implements MapSM {

    private UserRepository userRepository;

    public MapSMImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserLocationDTO> getAllUsersLocation() {
        return null;
    }
}
