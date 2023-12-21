package com.loveapp.loveapp.controller;

import com.loveapp.loveapp.entity.MensajeMotivacional;
import com.loveapp.loveapp.service.MensajeMotivacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class GeneralController {

    @Autowired
    MensajeMotivacionalService mensajeMotivacionalService;
    @GetMapping
    public List<MensajeMotivacional> getMensaje(){
        return mensajeMotivacionalService.getMensajesMotivacionales();
    }

}
