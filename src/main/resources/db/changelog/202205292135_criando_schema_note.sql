--liquibase formatted sql

--changeset nvoxland:1
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

--changeset nvoxland:2
CREATE TABLE notes
(
    id             BIGSERIAL,
    uuid           UUID    DEFAULT uuid_generate_v4() UNIQUE NOT NULL,
    title          VARCHAR(255),
    content        TEXT,
    apagado        BOOLEAN DEFAULT false                     NOT NULL,
    CONSTRAINT notes_pkey PRIMARY KEY (id)
)