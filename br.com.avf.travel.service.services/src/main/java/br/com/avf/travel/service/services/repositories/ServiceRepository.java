package br.com.avf.travel.service.services.repositories;

import br.com.avf.travel.commons.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long>{
    
}
