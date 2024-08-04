package com.sit.note_app.repositories;

import com.sit.note_app.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    List<Note> findAllByPublicness_LevelName(String levelName);
    List<Note> findAllByPublicness_LevelNameNot(String levelName);
}