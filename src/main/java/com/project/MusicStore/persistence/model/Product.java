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
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private Double price;
    private String type;

    @ManyToMany(mappedBy = "products")
    private Set<Cart> carts = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "payments_id")
    Payments payment;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_genre",
            joinColumns = @JoinColumn(name = "products_id"),
            inverseJoinColumns = @JoinColumn(name = "genres_id"))
    private Set<Genres> genres = new HashSet<>();
}
