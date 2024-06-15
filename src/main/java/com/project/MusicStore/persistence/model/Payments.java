package com.project.MusicStore.persistence.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "Payments")
public class Payments {

    @Id
    @GeneratedValue
    private Long id;

    private Double amount;

    private String method;

    private Date date;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order;

}
