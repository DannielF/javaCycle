create table series(
    ser_id  int primary key not null,
    ser_titulo  char(50) not null,
    ser_num_temp int not null,
    ser_num_eps  int not null
);
insert into series (ser_id, ser_titulo, ser_num_temp, ser_num_eps) values (10, "The walking dead","153", "11");
insert into series (ser_id, ser_titulo, ser_num_temp, ser_num_eps) values (11, "Viaje a las estrellas: la serie original", "80", "3");
insert into series (ser_id, ser_titulo, ser_num_temp, ser_num_eps) values (12, "Glow", "30", "3");
insert into series (ser_id, ser_titulo, ser_num_temp, ser_num_eps) values (13, "La casa de papel", "31", "4");
insert into series (ser_id, ser_titulo, ser_num_temp, ser_num_eps) values (14, "Friends", "236", "10");
insert into series (ser_id, ser_titulo, ser_num_temp, ser_num_eps) values (15, "Arrow", "170", "8");
insert into series (ser_id, ser_titulo, ser_num_temp, ser_num_eps) values (16, "The big bang theory", "279", "12");
insert into series (ser_id, ser_titulo, ser_num_temp, ser_num_eps) values (17, "Vikingos", "79", "6");