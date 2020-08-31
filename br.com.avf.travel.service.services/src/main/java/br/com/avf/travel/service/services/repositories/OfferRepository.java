package br.com.avf.travel.service.services.repositories;

import br.com.avf.travel.commons.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long>{
    
}
