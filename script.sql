-- Active: 1715899212322@@127.0.0.1@5432@20241_usjt_psc_quinta@public

-- ALTER TABLE tb_usuario_psc_quinta ADD COLUMN tipo INT;
CREATE TABLE usuarios(
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

CREATE TABLE PACIENTES(
    Codigo SERIAL PRIMARY KEY,
    Nome VARCHAR(255),
    Idade INTEGER,
    CPF VARCHAR(50),
    Endereco VARCHAR(255),
    Sexo VARCHAR(2),
    Telefone VARCHAR(50),
    Email VARCHAR(255)
)


Create TABLE Insumos(
    Codigo SERIAL PRIMARY KEY,
    Descricao VARCHAR(255),
    DataCri DATE,
    CodBarras VARCHAR(255)
)


