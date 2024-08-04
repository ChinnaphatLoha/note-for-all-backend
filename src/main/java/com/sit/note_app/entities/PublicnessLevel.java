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
@Table(name = "publicness_levels")
public class PublicnessLevel {
    @Id
    @Column(name = "publicness_id", insertable = false, updatable = false)
    private Byte id;

    @Size(max = 20)
    @NotNull
    @Column(name = "level_name", insertable = false, updatable = false, nullable = false, length = 20)
    private String levelName;

}