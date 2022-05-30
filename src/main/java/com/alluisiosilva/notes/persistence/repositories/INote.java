package com.alluisiosilva.notes.persistence.repositories;

import com.alluisiosilva.notes.persistence.models.Note;
import com.alluisiosilva.notes.rest.dto.NoteDTO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

@Repository
public interface INote extends JpaRepository<Note, Long> {

    @Override
    @Query("select n" +
            " from Note n" +
            " where n.apagado = false")
    List<Note> findAll();

    Optional<Note> findByUuid(UUID uuid);
}
