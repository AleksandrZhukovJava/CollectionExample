package me.ivan.collectionexamples.controller;

import lombok.RequiredArgsConstructor;
import me.ivan.collectionexamples.service.MapService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class MapController {
    private final MapService service;

}
