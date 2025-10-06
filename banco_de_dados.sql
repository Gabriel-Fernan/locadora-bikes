CREATE DATABASE locadora_bikes;
USE locadora_bikes;

CREATE TABLE cliente (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	cpf VARCHAR(14) NOT NULL,
	telefone VARCHAR(20) NOT NULL,
	email VARCHAR(255) NOT NULL
);

CREATE TABLE bicicleta (
	id INT PRIMARY KEY AUTO_INCREMENT,
	codigo VARCHAR(10) UNIQUE,
	status_bike ENUM('disponível', 'locada', 'manutenção') DEFAULT 'disponível'
);

CREATE TABLE manutencao (
	id INT PRIMARY KEY AUTO_INCREMENT,
	bicicleta_id INT NOT NULL,
	descricao TEXT NOT NULL,
	data_manutencao DATE NOT NULL,
	FOREIGN KEY (bicicleta_id) REFERENCES bicicleta(id)
);

CREATE TABLE locacao (
	id INT PRIMARY KEY AUTO_INCREMENT,
	cliente_id INT NOT NULL,
	bicicleta_id INT NOT NULL,
	data_inicio DATETIME NOT NULL,
	data_fim DATETIME,
	status_locacao ENUM('ativa', 'finalizada'),
	FOREIGN KEY (cliente_id) REFERENCES cliente(id),
	FOREIGN KEY (bicicleta_id) REFERENCES bicicleta(id)
);