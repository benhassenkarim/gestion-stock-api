package com.projet.gestiondestock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    /*@Id
    @GeneratedValue
    private Integer id;*/

    @CreatedDate
    @Column(name = "creationDate", nullable = false,updatable = false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedBy
    @Column(name = "lastUpdateDate")
    @JsonIgnore
    private Instant lastUpdateDate;
}
