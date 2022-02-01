package com.poc.service.metier.manually;

import com.poc.donnee.domain.Location;
import com.poc.donnee.domain.User;
import com.poc.donnee.dto.UserLocationDTO;
import com.poc.service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapManuallySMImpl implements MapManuallySM {

    private UserRepository userRepository;

    public MapManuallySMImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserLocationDTO> getAllUsersLocation() {
        return ((List<User>) userRepository
                .findAll())
                .stream()
                .map(this::convertToUserLocationDTO)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertToUserLocationDTO(User user) {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setUsername(user.getUsername());
        Location location = user.getLocation();
        userLocationDTO.setLat(location.getLat());
        userLocationDTO.setLng(location.getLng());
        userLocationDTO.setPlace(location.getPlace());
        return userLocationDTO;
    }
}
