-- Active: 1715899212322@@127.0.0.1@5432@20241_usjt_psc_quinta@public

-- ALTER TABLE tb_usuario_psc_quinta ADD COLUMN tipo INT;
CREATE TABLE tb_usuario_psc_quinta(
  CODIGO SERIAL PRIMARY KEY,
  login VARCHAR(255),
  senha VARCHAR(255),  
  NOME VARCHAR(255),  
  email VARCHAR(200),
  sexo VARCHAR (2),
  cpf VARCHAR(50),
  tipo VARCHAR(25)
  idade INT,  
);

