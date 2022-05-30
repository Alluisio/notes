package com.alluisiosilva.notes.rest.controllers;

import com.alluisiosilva.notes.rest.dto.NoteDTO;
import com.alluisiosilva.notes.rest.services.NoteBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/notes", produces = MediaType.APPLICATION_JSON_VALUE)
public class NoteController {

    @Autowired
    NoteBO noteBO;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<NoteDTO>> findAll() {
        List<NoteDTO> notes = noteBO.findAll();
        return ResponseEntity.ok().body(notes);
    }
}
