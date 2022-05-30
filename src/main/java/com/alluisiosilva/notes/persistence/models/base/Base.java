package com.alluisiosilva.notes.persistence.models.base;

import lombok.Data;
import org.hibernate.annotations.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@MappedSuperclass
public abstract class Base {

    @Id
    @OrderColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type = "org.hibernate.type.PostgresUUIDType")
    @Generated(GenerationTime.INSERT)
    private UUID uuid;

    private boolean apagado = false;

    @Override
    public boolean equals(Object obj) {
        try {
            return getUuid().compareTo(((Base) obj).getUuid()) == 0;
        } catch (Exception e) {
            return super.equals(obj);
        }
    }

}