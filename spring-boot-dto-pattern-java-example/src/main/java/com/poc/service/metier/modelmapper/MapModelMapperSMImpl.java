package com.poc.service.metier.modelmapper;

import com.poc.donnee.domain.User;
import com.poc.donnee.dto.UserLocationDTO;
import com.poc.service.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapModelMapperSMImpl implements MapModelMapperSM {

    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public MapModelMapperSMImpl(UserRepository userRepository) {
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
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        UserLocationDTO userLocationDTO = modelMapper
                .map(user, UserLocationDTO.class);
        return userLocationDTO;
    }
}
