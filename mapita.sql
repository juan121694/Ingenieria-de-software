CREATE TABLE usuario(idusuario serial NOT NULL, nombre text NOT NULL, correo text,contraseña text,fecha date,PRIMARY KEY(idusuario));
CREATE TABLE marcador(idmarcador serial NOT NULL,descripcion text,longitud float, latitud float,idusuario serial NOT NULL,FOREIGN KEY(idusuario)  REFERENCES usuario(idusuario),PRIMARY KEY(idmarcador));
INSERT INTO usuario(nombre, correo,contraseña,fecha) VALUES('juan','juan@ciencias.com','qwerty','1994-12-16');
SELECT *FROM usuario;
