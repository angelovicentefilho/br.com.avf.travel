package br.com.avf.travel.service.services.repositories;

import br.com.avf.travel.commons.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository  extends  JpaRepository<Flight, Long>{
    
}
