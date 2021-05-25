package com.example.tapukiraci.service;


import com.example.tapukiraci.model.Tapu;
import com.example.tapukiraci.repository.TapuRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TapuService {

    private final TapuRepository tapuRepository;

    public TapuService(TapuRepository tapuRepository) {
        this.tapuRepository = tapuRepository;
    }

    public Optional<Tapu> findTapuById(Integer tapuId){
        return tapuRepository.findById(tapuId);

    }
}
