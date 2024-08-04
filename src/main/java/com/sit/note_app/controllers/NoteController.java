package com.sit.note_app.controllers;

import com.sit.note_app.entities.Note;
import com.sit.note_app.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
@RequiredArgsConstructor
public class NoteController {
    private final NoteService service;

    @GetMapping("/public")
    public ResponseEntity<List<Note>> getPublicNotes() {
        return ResponseEntity.ok(service.getAllPublicNotes());
    }

    @GetMapping("")
    public ResponseEntity<List<Note>> getAllNotes() {
        // Get all notes that are not private, due to privacy concerns
        return ResponseEntity.ok(service.getAllNonPrivateNotes());
    }
}
