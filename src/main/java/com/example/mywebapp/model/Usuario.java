package com.example.mywebapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
}
