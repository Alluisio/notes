package com.alluisiosilva.notes.persistence.models;

import com.alluisiosilva.notes.persistence.models.base.Base;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notes", schema = "public")
public class Note extends Base {

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;
}
