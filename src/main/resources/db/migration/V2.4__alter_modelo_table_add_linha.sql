alter table modelo
    add column linha_id integer,
    add foreign key (linha_id) references linha(id);