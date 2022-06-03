package com.logicalis.la.demo.model.beer;

import lombok.*;

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

    private String name;

    private String type;

    public BeerModel(String name, String type) {
        this.setName(name);
        this.setType(type);
    }
}
