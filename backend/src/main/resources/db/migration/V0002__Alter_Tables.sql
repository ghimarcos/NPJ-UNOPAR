alter table cidade add constraint FKcidade_estado foreign key (estado_id) references estado (id);
alter table endereco add constraint FKendereco_cidade foreign key (cidade_id) references cidade (id);
alter table endereco add constraint FKendereco_usuario foreign key (usuario_id) references usuario (id);
