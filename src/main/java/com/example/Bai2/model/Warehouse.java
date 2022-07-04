package com.example.Bai2.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL)
    private Collection<Product> products;

}
