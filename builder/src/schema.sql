-- 
CREATE DATABASE builder;

USE builder;

-- nome da tabela: letras minusculas e plural
CREATE TABLE produtos (
	id        INTEGER PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(50),
	peso      DECIMAL(9,2)
);

-- consulta:
SELECT * FROM produtos;

-- inserção:
INSERT INTO produtos (descricao, peso) VALUES ('Goiabada', 300);

















