package com.project.MusicStore.persistence.model;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Builder
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Artists")
public class Artists {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(name = "name")
    public String name;
}
