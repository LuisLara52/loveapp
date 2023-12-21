package com.loveapp.loveapp.repository;

import com.loveapp.loveapp.entity.MensajeMotivacional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeMotivacionalRepository extends JpaRepository<MensajeMotivacional, Long> {

}
