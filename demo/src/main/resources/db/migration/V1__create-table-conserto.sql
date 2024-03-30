create table conserto(

id bigint not null auto_increment,
dataEntrada varchar(100) not null,
dataSaida varchar(100) not null,
nome varchar(100) not null,
anosExperiencia integer not null,
marca varchar(100) not null,
modelo varchar(100) not null,
ano integer not null,

primary key(id)

);