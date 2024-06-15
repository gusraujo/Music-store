package com.project.MusicStore.persistence.model;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "Genres")
public class Genres {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(name = "name")
    public String name;

    @ManyToMany(mappedBy = "genres")
    private Set<Product> products = new HashSet<>();
}
