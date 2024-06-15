package com.project.MusicStore.persistence.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "Orders")
public class Orders {

    @Id
    @GeneratedValue
    private Long id;

    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "order")
    private Payments payments;

    @ManyToMany
    @JoinTable(
            name = "orders_product",
            joinColumns = @JoinColumn(name = "orders_id"),
            inverseJoinColumns = @JoinColumn(name = "products_id")
    )
    private Set<Product> products = new HashSet<>();
}
