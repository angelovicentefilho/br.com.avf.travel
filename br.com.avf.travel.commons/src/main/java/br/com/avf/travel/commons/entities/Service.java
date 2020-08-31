package br.com.avf.travel.commons.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "services")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(setterPrefix = "with", builderClassName = "newInstance")
@EntityListeners(AuditingEntityListener.class)
public class Service implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(name = "date_start")
    @Temporal(TemporalType.DATE)
    private Date dateStart;

    @Column(name = "date_end")
    @Temporal(TemporalType.DATE)
    private Date dateEnd;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "service")
    private Flight flight;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "service")
    private Offer offer;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "service")
    private Hotel hotel;

}
