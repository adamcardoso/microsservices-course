package com.microsservices.hrpayroll.entities;


import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Worker implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter private Long id;

    @Getter @Setter private String name;
    @Getter @Setter private Double dailyIncome;
}
