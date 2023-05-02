DROP TABLE IF EXISTS venta;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS maquinas_registradoras;
DROP TABLE IF EXISTS cajeros;

CREATE TABLE productos (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
	precio int,
    PRIMARY KEY (id)
);

CREATE TABLE maquinas_registradoras (
	id int NOT NULL AUTO_INCREMENT,
	piso int,
    PRIMARY KEY (id)
);

CREATE TABLE cajeros (
	id int NOT NULL AUTO_INCREMENT,
	nom_apels varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE venta (
	id int NOT NULL AUTO_INCREMENT,
	cajero_id int DEFAULT NULL,
    maquina_id int DEFAULT NULL,
    producto_id int DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT venta_fk1 FOREIGN KEY (cajero_id) REFERENCES cajeros (id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT venta_fk2 FOREIGN KEY (maquina_id) REFERENCES maquinas_registradoras (id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT venta_fk3 FOREIGN KEY (producto_id) REFERENCES productos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO productos (nombre, precio) VALUES
('PS5', 540),
('Cafetera', 127),
('Freidora', 80),
('Cargador mobil', 25),
('Auriculares Bluetooth', 43);

INSERT INTO maquinas_registradoras (piso) VALUES
(4),
(1),
(3),
(1),
(5);

INSERT INTO cajeros (nom_apels) VALUES
('Javier Martinez Soler'),
('Emp Leado Delmes'),
('Celia Herrera Flores'),
('Yolanda Saez Montero'),
('Sergio Mora Martin');

INSERT INTO venta (cajero_id, maquina_id, producto_id) VALUES
(1, 5, 1),
(1, 5, 5),
(2, 4, 4),
(3, 1, 2),
(5, 2, 3);

INSERT INTO Usuario (username, password, role) VALUES 
('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin'),
('roger', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','user');