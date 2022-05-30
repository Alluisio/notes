--liquibase formatted sql

--changeset nvoxland:1
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

--changeset nvoxland:2
CREATE TABLE note
(
    uuid           UUID    DEFAULT uuid_generate_v4() UNIQUE NOT NULL,
    title          VARCHAR(255),
    content        TEXT,
    ativo          BOOLEAN DEFAULT true                      NOT NULL,
    apagado        BOOLEAN DEFAULT false                     NOT NULL,
    criado_em      TIMESTAMP(0) WITHOUT TIME ZONE,
    modificado_em  TIMESTAMP(0) WITHOUT TIME ZONE,
    criado_por     TEXT,
    modificado_por TEXT,
    CONSTRAINT note_pkey PRIMARY KEY (uuid)
)