-- SQL => Motor Relacional
-- Motor[mysql] - SMBD[workbench, sqlyog]
-- DDL[Lenguaje de definición de datos] 
-- DML[Lenguaje de manipulación de datos]

-- Eliminar primero la base de datos. 
DROP DATABASE security;

-- Crear base de datos 
CREATE DATABASE security;

-- Usar base de datos 
USE security;

-- Crear entidades de la base de datos [tablas]
CREATE TABLE person(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	first_name VARCHAR(50) NOT NULL,
	lastname VARCHAR(50) NOT NULL,
	address VARCHAR(50) NOT NULL,
	phone VARCHAR(20) NOT NULL,
	mail VARCHAR(30) NOT NULL,
	state BIT NOT NULL,
	create_at DATETIME NOT NULL,
	update_at DATETIME NULL,
	delete_at DATETIME NULL
);

CREATE TABLE user(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	user VARCHAR(30) NOT NULL,
	password VARCHAR(100) NOT NULL,
	person_id BIGINT NOT NULL UNIQUE,
	state BIT NOT NULL,
	create_at DATETIME NOT NULL,
	update_at DATETIME NULL,
	delete_at DATETIME NULL,
	FOREIGN KEY (person_id) REFERENCES person(id)
);

CREATE TABLE role(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	description VARCHAR(100) NOT NULL,
	state BIT NOT NULL,
	create_at DATETIME NOT NULL,
	update_at DATETIME NULL,
	delete_at DATETIME NULL	
);

CREATE TABLE user_role(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	user_id BIGINT NOT NULL,
	role_id BIGINT NOT NULL,	
	FOREIGN KEY (user_id) REFERENCES user(id),
	FOREIGN KEY (role_id) REFERENCES role(id)
);