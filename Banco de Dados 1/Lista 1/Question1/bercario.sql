CREATE DATABASE BERCARIO;

CREATE TABLE BEBE(
    idBebe          INT NOT NULL AUTO_INCREMENT,
    idMae           INT NOT NULL AUTO_INCREMENT,
    IdMedico        INT NOT NULL AUTO_INCREMENT,
    nome            VARCHAR(50) NOT NULL,
    dataNascimento  VARCHAR(20) NOT NULL,
    pesoNascimento  FLOAT NOT NULL,
    altura          FLOAT NOT NULL,
    mae             VARCHAR(50) NOT NULL,
    medico          VARCHAR(50) NOT NULL,

    PRIMARY KEY(idBebe),
    FOREIGN KEY(mae) references MAE(nome),
    FOREIGN KEY(medico) references MEDICO(nome),
    FOREIGN KEY(idMae) references MAE(idMae),
    FOREIGN KEY(IdMedico) references MEDICO(IdMedico)
);

CREATE TABLE MAE(
    idMae           INT NOT NULL AUTO_INCREMENT,
    IdMedico        INT NOT NULL AUTO_INCREMENT,
    nome            VARCHAR(50) NOT NULL,
    CPF             VARCHAR(50) NOT NULL,
    endereco        VARCHAR(50) NOT NULL,
    telefone        VARCHAR(50) NOT NULL
    dataNascimento  VARCHAR(20) NOT NULL,

    PRIMARY KEY(idMae),
    FOREIGN KEY(dataNascimento) references BEBE(dataNascimento),
    FOREIGN KEY(IdMedico) references MEDICO(IdMedico)
);

CREATE TABLE MEDICO(
    
    CRM             VARCHAR(50) NOT NULL,
    nome            VARCHAR(50) NOT NULL,
    telefone        VARCHAR(50) NOT NULL,
    especialidade   VARCHAR(20) NOT NULL,

    PRIMARY KEY(IdMedico),
);