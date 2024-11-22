create table pessoa(
	idPessoa serial primary key,
	nomePessoa varchar(30) not null,
	contato varchar(100) not null
);

insert into pessoa(nomePessoa,contato) values ('Reginaldo','teste@gmail.com');
select * from pessoa;

create table docente(
	idDocente serial primary key,
	numeroMatricula int not null,
	situacao varchar(1) not null,
	fkPessoa integer unique,
	constraint fk_pessoa foreign key (fkPessoa) references pessoa(idPessoa)
);

insert into docente(numeroMatricula,situacao,fkPessoa) values (10293939,'A',1);
select * from docente;