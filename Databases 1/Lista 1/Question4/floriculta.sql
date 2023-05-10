CREATE DATABASE FLORICULTURA;

CREATE TABLE CLIENTE(
    idCliente       INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    RG              INT NOT NULL UNIQUE,
    nome            VARCHAR(50) NOT NULL,
    telefone        INT NOT NULL,
    endereco        VARCHAR(100) NOT NULL,
);

CREATE TABLE PRODUTO(
    idProduto       INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    idTipo          INT NOT NULL,
    preco           FLOAT NOT NULL,
    quantidade      INT NOT NULL,

    FOREIGN KEY(idTipo) REFERENCES TIPO(idTipo)
);

CREATE TABLE TIPO(
    idTipo          INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    nome            VARCHAR(50) NOT NULL
);

CREATE TABLE COMPRA(
    idCompra        INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    idCliente       INT NOT NULL,
    idProduto       INT NOT NULL,
    dataCompra      DATE NOT NULL,
    valorTotal      FLOAT NOT NULL,

    PRIMARY KEY(idCliente),
    PRIMARY KEY(idProduto),
    FOREIGN KEY(idCliente) REFERENCES CLIENTE(idCliente),
    FOREIGN KEY(idProduto) REFERENCES PRODUTO(idProduto)
);