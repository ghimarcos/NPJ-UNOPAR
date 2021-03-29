create table agenda (id integer not null auto_increment, conteudo varchar(255), data datetime(6), descricao varchar(255), usuario_id integer, primary key (id)) engine=InnoDB default charset=utf8MB4;
create table atendimento (id integer not null auto_increment, datahora date, descricao varchar(255), motivo varchar(255), status varchar(255), pessoa_id integer, primary key (id)) engine=InnoDB default charset=utf8MB4;
create table atendimento_documento (data date, atendimento_id integer not null, documento_id integer not null, primary key (atendimento_id, documento_id)) engine=InnoDB default charset=utf8MB4;
create table cidade (id integer not null auto_increment, descricao varchar(255), estado_id integer, primary key (id)) engine=InnoDB default charset=utf8MB4;
create table comarca (id integer not null auto_increment, descricao varchar(255), primary key (id)) engine=InnoDB default charset=utf8MB4;
create table documento (id integer not null auto_increment, descricao varchar(255), processo_id integer, primary key (id)) engine=InnoDB default charset=utf8MB4;
create table endereco (id integer not null auto_increment, bairro varchar(255), cep varchar(255), complemento varchar(255), longradouro varchar(255), numero varchar(255), cidade_id integer, primary key (id)) engine=InnoDB default charset=utf8MB4;
create table estado (id integer not null auto_increment, descricao varchar(255), uf varchar(255), primary key (id)) engine=InnoDB default charset=utf8MB4;
create table permissao (id integer not null auto_increment, descricao varchar(255), primary key (id)) engine=InnoDB default charset=utf8MB4;
create table pessoa (id integer not null auto_increment, cpf varchar(14), data_nasc datetime(6), documento varchar(255), email varchar(255), estado_civil varchar(255), grau_escolar varchar(255), nome varchar(255), rg varchar(255), telefone varchar(255), tipo varchar(255), endereco_id integer, primary key (id)) engine=InnoDB default charset=utf8MB4;
create table processo (id integer not null auto_increment, status varchar(255), comarca_id integer, vara_id integer, primary key (id)) engine=InnoDB default charset=utf8MB4;
create table processo_pessoas (processo_id integer not null, pessoas_id integer not null) engine=InnoDB default charset=utf8MB4;
create table usuario (id integer not null auto_increment, email varchar(255), nome varchar(255), senha varchar(255), primary key (id)) engine=InnoDB default charset=utf8MB4;
create table usuario_permissao (id_usuario integer not null, id_permissao integer not null) engine=InnoDB default charset=utf8MB4;
create table vara (id integer not null auto_increment, descricao varchar(255), primary key (id)) engine=InnoDB default charset=utf8MB4;



