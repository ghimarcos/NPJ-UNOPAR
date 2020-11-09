create table categoria (id integer not null auto_increment, descricao varchar(255), primary key (id)) engine=InnoDB
create table cidade (id integer not null auto_increment, descricao varchar(255), estado_id integer, primary key (id)) engine=InnoDB
create table condicao_pagamento (id integer not null auto_increment, descricao varchar(255), primary key (id)) engine=InnoDB
create table departamento (id integer not null auto_increment, descricao varchar(255), primary key (id)) engine=InnoDB
create table endereco (id integer not null auto_increment, cep varchar(255), bairro varchar(255), complemento varchar(255), numero varchar(255), rua varchar(255), cidade_id integer, usu_id integer, primary key (id)) engine=InnoDB
create table estado (id integer not null auto_increment, uf varchar(255), descricao varchar(255), primary key (id)) engine=InnoDB
create table forma_pagamento (id integer not null auto_increment, descricao varchar(255), primary key (id)) engine=InnoDB
create table funcionario (id integer not null auto_increment, login varchar(255), senha varchar(255), perfil_id integer, primary key (id)) engine=InnoDB
create table itens_condicao_pagamento (id integer not null auto_increment, descricao varchar(255), dias integer, condicao_pagamento_id integer, primary key (id)) engine=InnoDB
create table itens_pedido (produto integer, quantidade decimal(19,2), pedido_id integer not null, produto_id integer not null, primary key (pedido_id, produto_id)) engine=InnoDB
create table pedido (id integer not null auto_increment, data_entrega date, data_pedido date, cond_pag_id integer, end_id integer, forma_pag_id integer, usu_id integer, primary key (id)) engine=InnoDB
create table perfil (id integer not null auto_increment, primary key (id)) engine=InnoDB
create table perfil_permissoes (perfil_id integer not null, permissoes_id integer not null) engine=InnoDB
create table permissao (id integer not null auto_increment, descricao varchar(255), primary key (id)) engine=InnoDB
create table permissao_perfil (permissao_id integer not null, perfil_id integer not null) engine=InnoDB
create table produto (id integer not null auto_increment, data_validade date, descricao varchar(255), preco decimal(19,2), promocao decimal(19,2), tamanho_unidade varchar(255), unidade_medida_id integer, categoria_id integer, departamento_id integer, primary key (id)) engine=InnoDB
create table unidade_medida (id integer not null auto_increment, descricao varchar(255), sigla varchar(255), primary key (id)) engine=InnoDB
create table usuario (id integer not null auto_increment, login varchar(255), senha varchar(255), primary key (id)) engine=InnoDB
alter table cidade add constraint FKcidade_estado foreign key (estado_id) references estado (id)
alter table endereco add constraint FKendereco_cidade foreign key (cidade_id) references cidade (id)
alter table endereco add constraint FKendereco_usu foreign key (usu_id) references usuario (id)
alter table funcionario add constraint FKfunc_perfil foreign key (perfil_id) references perfil (id)
alter table itens_condicao_pagamento add constraint FKitensCondPag_condPag foreign key (condicao_pagamento_id) references condicao_pagamento (id)
alter table itens_pedido add constraint FKitensPed_pedido foreign key (pedido_id) references pedido (id)
alter table itens_pedido add constraint FKitensPed_produto foreign key (produto_id) references produto (id)
alter table pedido add constraint FKpedido_condPag foreign key (cond_pag_id) references condicao_pagamento (id)
alter table pedido add constraint FKpedido_end foreign key (end_id) references endereco (id)
alter table pedido add constraint FKpedido_formaPag foreign key (forma_pag_id) references forma_pagamento (id)
alter table pedido add constraint FKpedido_usu foreign key (usu_id) references usuario (id)
alter table perfil_permissoes add constraint FKperfilPerm_perm foreign key (permissoes_id) references permissao (id)
alter table perfil_permissoes add constraint FKperfilPerm_perfil foreign key (perfil_id) references perfil (id)
alter table permissao_perfil add constraint FKpermPerfil_perfil foreign key (perfil_id) references perfil (id)
alter table permissao_perfil add constraint FKpermPerfil_perm foreign key (permissao_id) references permissao (id)
alter table produto add constraint FKproduto_undMedida foreign key (unidade_medida_id) references unidade_medida (id)
alter table produto add constraint FKproduto_cat foreign key (categoria_id) references categoria (id)
alter table produto add constraint FKproduto_depart foreign key (departamento_id) references departamento (id)
