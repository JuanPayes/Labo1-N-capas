package org.example.labo1.Domain.Entities;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    private long id;
    private String name;
    private String type;
    private List<String> weakness;
    private String zona;
    private String region;
}
