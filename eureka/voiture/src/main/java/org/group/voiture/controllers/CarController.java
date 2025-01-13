package org.group.voiture.controllers;

import  org.group.voiture.models.CarResponse;
import org.group.voiture.services.CarRestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/voiture")
public class CarController {

    @Autowired
    private CarRestTemplateService carRestTemplateService;

    @GetMapping("/rest-template/all")
    public List<CarResponse> findAll() {
        return carRestTemplateService.findAll ();
    }

    @GetMapping("/rest-template/{id}")
    public CarResponse findById(@PathVariable Long id) throws Exception {
        return carRestTemplateService.findById (id);
    }

}