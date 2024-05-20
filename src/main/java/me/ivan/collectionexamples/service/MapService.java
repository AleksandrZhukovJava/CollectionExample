package me.ivan.collectionexamples.service;

import lombok.RequiredArgsConstructor;
import me.ivan.collectionexamples.repository.MapRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MapService {
    private final MapRepository repository;

}
