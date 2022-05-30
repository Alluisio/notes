package com.alluisiosilva.notes.rest.services;

import com.alluisiosilva.notes.persistence.models.Note;
import com.alluisiosilva.notes.persistence.repositories.INote;
import com.alluisiosilva.notes.rest.dto.NoteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteBO {

    @Autowired INote iNote;

    public List<NoteDTO> findAll() {
        List<Note> notes = iNote.findAll();
        return notes.stream().map(NoteDTO::new).collect(Collectors.toList());
    }
}
