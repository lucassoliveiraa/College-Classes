CREATE DATABASE BIBLIOTECA;

CREATE TABLE AUTOR(
    idNome          INT NOT NULL AUTO_INCREMENT,
    nome            VARCHAR(50) NOT NULL,
    nacionalidade   VARCHAR(50) NOT NULL,

    PRIMARY KEY(idNome)
);

CREATE TABLE LIVRO(
    idLivro INT NOT NULL AUTO_INCREMENT,
    ISBN    VARCHAR(50) NOT NULL,
    titulo  VARCHAR(50) NOT NULL,
    autor   VARCHAR(50) NOT NULL,
    ano     INT NOT NULL,

    PRIMARY KEY(idLivro),
    FOREIGN KEY(autor) references AUTOR(nome)
);

CREATE TABLE CATEGORIA(
    idCategoria INT NOT NULL AUTO_INCREMENT,
    cod         INT NOT NULL AUTO_INCREMENT,
    descricao   VARCHAR(100) NOT NULL,

    PRIMARY KEY(idCategoria),
);

CREATE TABLE ESCRITO(
    idNome  INT NOT NULL AUTO_INCREMENT,
    idLivro INT NOT NULL AUTO_INCREMENT,

    PRIMARY KEY(idNome),
    PRIMARY KEY(idLivro),
    FOREIGN KEY(idNome) references AUTOR(idNome),
    FOREIGN KEY(idLivro) references LIVRO(idLivro)
);

CREATE TABLE PERTENCE(
    idCategoria INT NOT NULL AUTO_INCREMENT,
    idLivro     INT NOT NULL AUTO_INCREMENT,

    PRIMARY KEY(idCategoria),
    PRIMARY KEY(idLivro),
    FOREIGN KEY(idCategoria) references CATEGORIA(idCategoria),
    FOREIGN KEY(idLivro) references LIVRO(idLivro)
);