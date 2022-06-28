create table if not exists marca (
    id integer not null auto_increment,
    nome varchar(50) not null,
    pais varchar(50) not null,
    primary key (id)
);