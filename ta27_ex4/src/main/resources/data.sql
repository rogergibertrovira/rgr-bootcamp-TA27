DROP TABLE IF EXISTS reserva;
DROP TABLE IF EXISTS equipos;
DROP TABLE IF EXISTS investigadores;
DROP TABLE IF EXISTS facultades;

CREATE TABLE facultades (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
    PRIMARY KEY (id)
);

CREATE TABLE investigadores (
	id varchar(8) NOT NULL,
    nom_apels varchar(255) DEFAULT NULL,
    facultad_id int DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT investigadores_fk1 FOREIGN KEY (facultad_id) REFERENCES facultades (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE equipos (
	id char(4) NOT NULL,
    nombre varchar(100) DEFAULT NULL,
    facultad_id int DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT equipos_fk1 FOREIGN KEY (facultad_id) REFERENCES facultades (id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE reserva (
	id int NOT NULL AUTO_INCREMENT,
    comienzo date,
    fin date,
    investigador_id varchar(8) DEFAULT NULL,
    equipo_id char(4) DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT reserva_fk1 FOREIGN KEY (investigador_id) REFERENCES investigadores (id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT reserva_fk2 FOREIGN KEY (equipo_id) REFERENCES equipos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO facultades (nombre) VALUES 
	('Universidad de Girona'), 
	('Universidad Rovira i Virgili'), 
	('Universidad Politecnica de Barcelona');

INSERT INTO investigadores VALUES
	('75132883', 'Simona Rosado', 1),
	('48784301', 'Tomas Pons', 2),
	('53188299', 'Maria Gamero', 3),
	('37902631', 'Miriam Estrada', 1),
	('87112941', 'Amadeo Sabater', 3);

INSERT INTO equipos VALUES 
	('123','Agitador', 3),
	('324','Microscopio optico', 2),
	('554','Criostato', 3),
	('678','Campana extractora', 1),
	('973','Destilador', 3),
	('258','Microscopio electronico', 2),
	('885','Medidor fotovoltaico', 2),
	('113','Ordenador', 1),
	('394','Espectrofotometro', 1),
	('457','Bomba de vacio', 3);

INSERT INTO reserva (comienzo, fin, investigador_id, equipo_id) VALUES 
	('2023-04-14', '2023-04-16', '75132883', '678'),
	('2023-06-30', '2023-07-02', '37902631', '457'),
	('2023-05-21', '2023-05-29', '53188299', '973'),
	('2023-06-01', '2023-06-05', '87112941', '324'),
	('2023-07-07', '2023-07-09', '48784301', '258');

INSERT INTO Usuario (username, password, role) VALUES 
('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin'),
('roger', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','user');