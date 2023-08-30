CREATE DATABASE ESCOLA;

CREATE TABLE TURMA(
    idTurma     INT NOT NULL AUTO_INCREMENT UNIQUE;
    idSala      INT NOT NULL,
    ano         INT NOT NULL AUTO_INCREMENT;

    PRIMARY KEY(idTurma),
    FOREIGN KEY(idSala) references SALA(idSala)
); 

CREATE TABLE PROFESSOR(
    idProfessor         INT NOT NULL AUTO_INCREMENT UNIQUE,
    disciplina          VARCHAR(50) NOT NULL,

    PRIMARY KEY(idProfessor)
);

CREATE TABLE SALA(
    idSala          INT NOT NULL AUTO_INCREMENT,
    andar           INT NOT NULL,

    PRIMARY KEY(idSala)
);

CREATE TABLE PROFESSORTURMA(
    idTurma             INT NOT NULL AUTO_INCREMENT,
    idProfessor         INT NOT NULL AUTO_INCREMENT,

    PRIMARY KEY(idTurma),
    PRIMARY KEY(idProfessor),
    FOREIGN KEY(idTurma) references TURMA(idTurma),
    FOREIGN KEY(idProfessor) references PROFESSOR(idProfessor)
);