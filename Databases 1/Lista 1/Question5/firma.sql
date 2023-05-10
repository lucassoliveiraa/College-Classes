CREATE DATABASE FIRMA;

CREATE TABLE CLIENTE(
    idCliente       INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    nome            VARCHAR(50) NOT NULL,
    endereco        VARCHAR(100) NOT NULL,
    telefone        INT NOT NULL,
    statuss         VARCHAR(1),
    limiteCredito   FLOAT NOT NULL,
);

CREATE TABLE CATEGORIA(
    idCategoria     INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    nome            VARCHAR(50) NOT NULL
);

CREATE TABLE PRODUTO(
    idProduto       INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    idCategoria     INT NOT NULL,
    nome            VARCHAR(50) NOT NULL,
    preco           FLOAT NOT NULL,

    FOREIGN KEY(idCategoria) REFERENCES CATEGORIA(idCategoria)
);

CREATE TABLE PEDIDO(
    idPedido        INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
    idCliente       INT NOT NULL,
    dataPedido      DATE NOT NULL,

    FOREIGN KEY(idCliente) REFERENCES CLIENTE(idCliente)
);

CREATE TABLE PEDIDO_ENVOLVE(
    idPedido        INT NOT NULL,
    idProduto       INT NOT NULL,

    PRIMARY KEY(idPedido),
    PRIMARY KEY(idProduto),
    FOREIGN KEY(idPedido) REFERENCES PEDIDO(idPedido),
    FOREIGN KEY(idProduto) REFERENCES PRODUTO(idProduto)
);