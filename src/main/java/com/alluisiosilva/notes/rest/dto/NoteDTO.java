package com.alluisiosilva.notes.rest.dto;

import com.alluisiosilva.notes.persistence.models.Note;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class NoteDTO {

    private UUID uuid;

    private String title;

    private String content;

    public NoteDTO(Note note) {
        this.uuid = note.getUuid();
        this.title = note.getTitle();
        this.content = note.getContent();
    }
}
