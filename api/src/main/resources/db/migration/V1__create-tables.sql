create table organizador(
 	id bigint not null auto_increment,
	nome varchar(100) not null,
    email varchar(100) not null unique,
    fone varchar(20) not null,
    ativo tinyint,
    primary key(id)
);

create table area(
 	area_id bigint not null auto_increment,
	descricao varchar(100) not null,
    primary key(area_id)
);


create table autor(
 	autor_id bigint not null auto_increment,
	nome varchar(100) not null,
    email varchar(100) not null unique,
    instituicao varchar(100) not null,
    fone varchar(20) not null,
    ativo tinyint,
    primary key(autor_id)
);

create table artigo(
	 artigo_id bigint not null auto_increment,
	 titulo varchar(100) not null, 
	 resumo text not null, 
	 key_Word1 varchar(100) not null,
	 key_Word2 varchar(100) not null,
	 key_Word3 varchar(100) not null,
	 data_Submissao date, 
	 area_id bigint not null,
	 primary key(artigo_id),
	 constraint fk_area_id foreign key (area_id) references area(area_id)
);

create table artigo_autor(
	autor_id bigint not null,
	artigo_id bigint not null,
	primary key(autor_id, artigo_id),
	constraint fk_autor_id foreign key(autor_id) references autor(autor_id),
	constraint fk_artigo_id foreign key(artigo_id) references artigo(artigo_id)
);

