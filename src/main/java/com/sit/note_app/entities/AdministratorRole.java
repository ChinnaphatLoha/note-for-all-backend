package com.sit.note_app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "administrator_roles")
public class AdministratorRole {
    @Id
    @Column(name = "role_id", nullable = false)
    private Short id;

    @Size(max = 50)
    @NotNull
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Size(max = 8)
    @NotNull
    @Column(name = "token", nullable = false, length = 8)
    private String token;

    @Size(max = 200)
    @Column(name = "description", length = 200)
    private String description;

}