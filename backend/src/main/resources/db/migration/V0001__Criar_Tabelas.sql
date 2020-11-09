create table cidade (id integer not null auto_increment, descricao varchar(90), estado_id integer, primary key (id)) engine=InnoDB charset=UTF8MB4;
create table endereco (id integer not null auto_increment, cep varchar(9), bairro varchar(90), complemento varchar(90), numero varchar(10), rua varchar(90), cidade_id integer, usuario_id integer, primary key (id)) engine=InnoDB charset=UTF8MB4;
create table estado (id integer not null auto_increment, uf varchar(2), descricao varchar(90), primary key (id)) engine=InnoDB charset=UTF8MB4;
create table usuario (id integer not null auto_increment, nome varchar(40), email varchar(40), senha varchar(40), data_nasc date,  primary key (id)) engine=InnoDB charset=UTF8MB4;