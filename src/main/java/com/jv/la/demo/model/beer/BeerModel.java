package com.jv.la.demo.model.beer;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "beer")
@Getter
@Setter
public class BeerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    public BeerModel(String name, String type) {
        this.setName(name);
        this.setType(type);
    }
}
