create table if not exists linha(
    id integer not null auto_increment,
    nome varchar(50) not null,
    descricao varchar(100),
    primary key(id)
);