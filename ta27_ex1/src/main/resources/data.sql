DROP TABLE IF EXISTS suministra;
DROP TABLE IF EXISTS piezas;
DROP TABLE IF EXISTS proveedores;

CREATE TABLE piezas (
	id int NOT NULL AUTO_INCREMENT,
    nombre varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE proveedores (
	id char(4) NOT NULL,
	nombre varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE suministra (
	id int NOT NULL AUTO_INCREMENT,
    pieza_id int DEFAULT NULL,
    proveedor_id char(4) DEFAULT NULL,
    precio int DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT suministra_FK1 FOREIGN KEY (pieza_id) REFERENCES piezas (id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT suministra_FK2 FOREIGN KEY (proveedor_id) REFERENCES proveedores (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO piezas (nombre) VALUES 
('Intermitente'),
('Bujia'),
('Disco freno'),
('Pneumatico'),
('Bloque motor');

INSERT INTO proveedores (id, nombre) VALUES 
('yam1', 'Yamaha'),
('hnd1', 'Honda'),
('apr1', 'Aprilia'),
('szk1', 'Suzuki');

INSERT INTO suministra (pieza_id, proveedor_id, precio) VALUES
(1, 'apr1', 25),
(2, 'szk1', 50),
(3, 'hnd1', 200),
(4, 'apr1', 250),
(5, 'yam1', 540),
(5, 'hnd1', 630);

INSERT INTO Usuario (username, password, role) VALUES 
('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin'),
('roger', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','user');