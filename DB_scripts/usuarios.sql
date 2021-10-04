create table usuarios(
	usu_alias varchar(30) not null primary key,
    usu_nombre  char(20) not null,
    usu_apellido char(20) not null,
    usu_email  varchar(30) not null,
    usu_celular varchar(20) not null,
    usu_contrasenia varchar(30) not null,
    usu_fecha_nac date not null
);
insert into usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_celular, usu_contrasenia, usu_fecha_nac) values ("lucky","Pedro", "Perez", "pedpe@yahoo.es", "325162753", "hfyr5g+", "1950-10-1");
insert into usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_celular, usu_contrasenia, usu_fecha_nac) values ("malopez", "Maria", "Lopez", "pedpe@gmail.es", "325162753", "hfyr5g+", "1970-10-1");
insert into usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_celular, usu_contrasenia, usu_fecha_nac) values ("diva", "Ana", "Diaz", "pedpe@yahoo.es", "325162753", "hfyr5g+", "1950-10-1");
insert into usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_celular, usu_contrasenia, usu_fecha_nac) values ("dreamer", "Luis", "Rojas", "pedpe@hotmail.es", "325162753", "hfyr5g+", "1950-10-1");
insert into usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_celular, usu_contrasenia, usu_fecha_nac) values ("ninja", "Andres", "Cruz", "pedpe@yahoo.es", "325162753", "hfyr5g+", "1950-10-1");
insert into usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_celular, usu_contrasenia, usu_fecha_nac) values ("neon", "Nelson", "Ruiz", "pedpe@yahoo.es", "325162753", "hfyr5g+", "1980-10-1");
insert into usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_celular, usu_contrasenia, usu_fecha_nac) values ("rose", "Claudia", "Mendez", "pedpe@yahoo.es", "325162753", "hfyr5g+", "1950-10-1");
insert into usuarios (usu_alias, usu_nombre, usu_apellido, usu_email, usu_celular, usu_contrasenia, usu_fecha_nac) values ("green", "Jorge", "Rodriguez", "pedpe@yahoo.es", "325162753", "hfyr5g+", "1950-10-1");