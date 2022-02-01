package com.poc.service.metier.mapstruct;

import com.poc.donnee.domain.User;
import com.poc.donnee.dto.UserLocationDTO;
import com.poc.service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapMapStructSMImpl implements MapMapStructSM {

    private UserRepository userRepository;
    private UserLocationMapper userLocationMapper;

    public MapMapStructSMImpl(UserRepository userRepository, UserLocationMapper userLocationMapper) {
        this.userRepository = userRepository;
        this.userLocationMapper = userLocationMapper;
    }

    @Override
    public List<UserLocationDTO> getAllUsersLocation() {
        List<User> list = userRepository.findAll();
        return userLocationMapper.toDtos(list);
    }
}
