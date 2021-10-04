create table director(
    dir_id  int primary key,
    dir_nombre  char(20),
    dir_apellido char(20),
    dir_nacionalidad  char(40)
);
insert into director (dir_id, dir_nombre, dir_apellido, dir_nacionalidad) values (101, "Hayo","Miyazaki", "japones");
insert into director (dir_id, dir_nombre, dir_apellido, dir_nacionalidad) values (102, "Joss", "Whedon", "estadounidense");
insert into director (dir_id, dir_nombre, dir_apellido, dir_nacionalidad) values (103, "Christopher", "Nolan", "estadounidense");
insert into director (dir_id, dir_nombre, dir_apellido, dir_nacionalidad) values (104, "Bong", "Joon-ho", "coreano");
insert into director (dir_id, dir_nombre, dir_apellido, dir_nacionalidad) values (105, "Vincent", "Ward", "neozelandes");