
DROP DATABASE IF EXISTS tadswitter;

CREATE DATABASE tadswitter;

USE tadswitter;

DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
    id_usuario INTEGER      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome       VARCHAR(50)  NOT NULL,
    senha      VARCHAR(32)  NOT NULL,
    email      VARCHAR(100) NOT NULL
);

-- DESCRIBE usuarios; -- mostra o schema

INSERT INTO usuarios (nome, senha, email)
VALUES ('teste', md5('senhateste'), 'teste@teste.com');

SELECT * FROM usuarios;
