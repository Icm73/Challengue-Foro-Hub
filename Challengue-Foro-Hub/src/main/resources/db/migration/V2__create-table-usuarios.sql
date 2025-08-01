create table usuarios(
    id bigint not null auto_increment,
    login varchar(150) not null,
    contrasena varchar(200) not null,

    primary key(id)
);