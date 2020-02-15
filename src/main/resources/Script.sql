CREATE TABLE reserva (
  id int NOT NULL AUTO_INCREMENT,
  nombre_persona varchar(20) NOT NULL,
  cant_persona int,
  cant_cuarto int ,
  tipo_cuarto varchar(20),
  fech_reserva datetime,
  fech_ingreso date,
  fech_salida date,
  costo_total double,
  tipo_pago varchar(20) not null,
  PRIMARY KEY (id)
); 