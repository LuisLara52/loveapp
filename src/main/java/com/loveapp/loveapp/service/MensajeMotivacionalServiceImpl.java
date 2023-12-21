package com.loveapp.loveapp.service;

import com.loveapp.loveapp.entity.MensajeMotivacional;
import com.loveapp.loveapp.repository.MensajeMotivacionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeMotivacionalServiceImpl implements  MensajeMotivacionalService{
    @Autowired
    MensajeMotivacionalRepository mensajeMotivacionalRepository;
    @Override
    public List<MensajeMotivacional> getMensajesMotivacionales() {
        List<MensajeMotivacional> listaMensajes=mensajeMotivacionalRepository.findAll();
        return listaMensajes;
    }
}
