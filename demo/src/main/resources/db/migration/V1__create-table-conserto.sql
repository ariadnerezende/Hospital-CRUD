create table conserto(

id bigint not null auto_increment,
dataentrada varchar(100) not null,
datasaida varchar(100) not null,
nome varchar(100) not null,
anosexperiencia integer not null,
marca varchar(100) not null,
modelo varchar(100) not null,
ano integer not null,

primary key(id)

);