INSERT IGNORE INTO ciudad (id, nombre_ciudad) VALUES
(1, 'Mendoza'),
(2, 'Esquel'),
(3, 'Tierra del Fuego'),
(4, 'Misiones'),
(5, 'Córdoba');

INSERT IGNORE INTO aerolinea (id, nombre_aerolinea) VALUES
(1, 'Aerolineas Argentinas'),
(2, 'LATAM'),
(3, 'Flybondi');

INSERT IGNORE INTO aeropuerto (id, nombre_aeropuerto, ciudad_id) VALUES
(1, 'Aeropuerto El Plumerillo', 1),
(2, 'Aeropuerto Esquel', 2),
(3, 'Aeropuerto Malvinas Argentinas', 3),
(4, 'Aeropuerto Cataratas del Iguazu', 4),
(5, 'Aeropuerto Ambrosio Taravella', 5);

INSERT IGNORE INTO avion (id, numero_avion) VALUES
(1, 101),
(2, 202),
(3, 303);

INSERT IGNORE INTO piloto (id, dni_persona, nombre_persona, apellido_persona, numero_piloto) VALUES
(1, 25000001, 'Carlos', 'Garcia', 1001),
(2, 30000002, 'Laura', 'Martinez', 1002),
(3, 28000003, 'Marcos', 'Lopez', 1003);

INSERT IGNORE INTO vuelo (id, numero_vuelo, fecha, avion_id, aerolinea_id, piloto_id, destino_id) VALUES
(1, 1001, '2026-06-15', 1, 1, 1, 1),
(2, 1002, '2026-06-16', 2, 2, 2, 2),
(3, 1003, '2026-06-17', 3, 3, 3, 3),
(4, 1004, '2026-06-18', 1, 1, 1, 4),
(5, 1005, '2026-06-19', 2, 2, 2, 5);

INSERT IGNORE INTO vuelo_aeropuerto (vuelo_id, aeropuerto_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);
