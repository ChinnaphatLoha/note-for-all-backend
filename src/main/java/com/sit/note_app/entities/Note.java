package com.sit.note_app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @NotNull
    @Lob
    @Column(name = "content", nullable = false)
    private String content;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "publicness_id", nullable = false)
    private PublicnessLevel publicness;

    @CreatedDate
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", insertable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at", insertable = false, updatable = false)
    private Instant updatedAt;

}