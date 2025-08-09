package com.akm.finance.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Currency {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, length = 3, nullable=false)
    private String code;

    @Column(nullable=false)
    private String name;

    @Column(length = 5)
    private String symbol;
}
