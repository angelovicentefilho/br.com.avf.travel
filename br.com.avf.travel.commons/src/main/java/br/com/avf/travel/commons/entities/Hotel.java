package br.com.avf.travel.commons.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with", builderClassName = "newInstance")
@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_hotel")
    private String typeHotel;

    @Column(name = "description")
    private String description;

    @Column(name = "nr_starts")
    private Long nbStars;

    @Column(name = "address")
    private String address;

    @Column(name = "nr_rooms")
    private Long nbRoom;

    @Column(name = "nr_resident")
    private Long nbResident;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "service_id", nullable = false)
    @JsonBackReference
    private Service service;
}
