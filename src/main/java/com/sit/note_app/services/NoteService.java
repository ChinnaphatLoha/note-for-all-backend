package com.sit.note_app.services;

import com.sit.note_app.entities.Note;
import com.sit.note_app.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public List<Note> getAllPublicNotes() {
        return noteRepository.findAllByPublicness_LevelName("public");
    }

    public List<Note> getAllNonPrivateNotes() {
        return noteRepository.findAllByPublicness_LevelNameNot("private");
    }
}
