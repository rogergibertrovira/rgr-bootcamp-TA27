DROP TABLE IF EXISTS asignado;
DROP TABLE IF EXISTS proyectos;
DROP TABLE IF EXISTS cientificos;

CREATE TABLE proyectos (
	id varchar(4) NOT NULL,
	nombre varchar(255),
	horas int,
    PRIMARY KEY (id)
);
	
CREATE TABLE cientificos (
	id varchar(8) NOT NULL,
	nom_apels varchar(255),
    PRIMARY KEY (id)
);
	
CREATE TABLE asignado (
	id varchar(4) NOT NULL,
	proyecto_id varchar(4) DEFAULT NULL,
	cientifico_id varchar(8) DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT asignado_fk1 FOREIGN KEY (proyecto_id) REFERENCES proyectos (id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT asignado_fk2 FOREIGN KEY (cientifico_id) REFERENCES cientificos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO proyectos (id, nombre, horas) VALUES 
	('a23r', 'Rayo Mortal X', 125),
	('b112', 'Rayo No Mortal Y', 2000),
	('y67j', 'Escudo de fotones', 800),
	('fr33', 'Jetpack Neutronico', 340),
	('ip00', 'Tenedor Cuantico', 575);
	
INSERT INTO cientificos (id, nom_apels) VALUES 
	('33275849', 'Lasien Tyffika'),
	('84738291', 'Profesor Frink'),
	('99826474', 'Victor Frankenstein'),
	('12674893', 'Fausto El Portugues'),
	('45637829', 'Hubert Farnsworth');
    
INSERT INTO asignado (id, proyecto_id, cientifico_id) VALUES
	('a1', 'a23r', '84738291'),
	('a2', 'b112', '33275849'),
	('a3', 'y67j', '45637829'),
	('a4', 'fr33', '99826474'),
	('a5', 'ip00', '12674893');

select * from asignado;

INSERT INTO Usuario (username, password, role) VALUES 
('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin'),
('roger', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','user');