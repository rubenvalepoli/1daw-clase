-- Creación de la tabla clientes
CREATE TABLE clientes (
    cliente_id INT PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    apellido VARCHAR2(100) NOT NULL,
    email VARCHAR2(100),
    telefono VARCHAR2(20)
);

-- Creación de la tabla vuelos
CREATE TABLE vuelos (
    vuelo_id INT PRIMARY KEY,
    origen VARCHAR2(100) NOT NULL,
    destino VARCHAR2(100) NOT NULL,
    fecha DATE NOT NULL,
    asientos_disponibles INT,
    estado VARCHAR2(20) NOT NULL
);

-- Creación de la tabla reserva
CREATE TABLE reservas (
    reserva_id INT PRIMARY KEY,
    cliente_id INT,
    vuelo_id INT,
    fecha_reserva DATE NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(cliente_id),
    FOREIGN KEY (vuelo_id) REFERENCES vuelos(vuelo_id)
);

-- Creación de la tabla empleados
CREATE TABLE empleados (
    empleado_id INT PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    apellido VARCHAR2(100) NOT NULL,
    puesto VARCHAR2(50) NOT NULL,
    vuelo_id INT,
    FOREIGN KEY (vuelo_id) REFERENCES vuelos(vuelo_id)
);

-- Inserciones de ejemplo en la tabla clientes
INSERT INTO clientes (cliente_id, nombre, apellido, email, telefono)
VALUES (1, 'Ana', 'García', 'ana@example.com', '123456789');

INSERT INTO clientes (cliente_id, nombre, apellido, email, telefono)
VALUES (2, 'Pedro', 'Martínez', 'pedro@example.com', '987654321');

-- Inserciones de ejemplo en la tabla vuelos
INSERT INTO vuelos (vuelo_id, origen, destino, fecha, asientos_disponibles, estado)
VALUES (1, 'Madrid', 'Barcelona', TO_DATE('2024-05-20', 'YYYY-MM-DD'), 100, 'Disponible');

INSERT INTO vuelos (vuelo_id, origen, destino, fecha, asientos_disponibles, estado)
VALUES (2, 'Barcelona', 'Madrid', TO_DATE('2024-05-21', 'YYYY-MM-DD'), 50, 'Disponible');

INSERT INTO reservas (reserva_id, cliente_id, vuelo_id, fecha_reserva) VALUES (1, 1, 1, TO_DATE('2024-05-10', 'YYYY-MM-DD'));

INSERT INTO reservas (reserva_id, cliente_id, vuelo_id, fecha_reserva) VALUES (2, 2, 2, TO_DATE('2024-05-15', 'YYYY-MM-DD'));

-- Inserciones de ejemplo en la tabla empleados
INSERT INTO empleados (empleado_id, nombre, apellido, puesto, vuelo_id)
VALUES (1, 'Juan', 'Perez', 'Piloto', 1);

INSERT INTO empleados (empleado_id, nombre, apellido, puesto, vuelo_id)
VALUES (2, 'María', 'López', 'Azafata', 1);


