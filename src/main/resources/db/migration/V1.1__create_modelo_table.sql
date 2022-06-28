create table if not exists modelo (
    id integer not null auto_increment,
    nome varchar(50) not null,
    ano integer(4) not null,
    marca_id integer not null,
    primary key (id),
    foreign key (marca_id) references marca(id)
);