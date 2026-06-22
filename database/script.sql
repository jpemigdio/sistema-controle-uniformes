create database gestao_uniforme;
use gestao_uniforme;

create table if not exists uniforme (
	id int not null auto_increment,
	modalidade varchar(100) not null,
    descricao varchar(100) not null,
    cor ENUM("CLARO", "ESCURO") not null,
    fornecedor varchar (100),
    status ENUM(
		"DISPONIVEL",
        "EM_USO",
        "EM_MANUTENCAO",
        "DANIFICADO"
) not null default "DISPONIVEL",
localizacao varchar(100),
responsavel varchar(100),
estadoconservacao ENUM(
	"NOVO",
    "CONSERVADO",
    "GASTO"
)not null default "NOVO",
primary key (id)
) engine = InnoDB -- define o mecanismo da tabela
default charset = utf8mb4 -- permite armazenar acentos e emoji
collate = utf8mb4_unicode_ci; -- define regras de comparacao de texto


create table if not exists uniforme_solicitacao(
	id int not null auto_increment,
    uniforme_id int not null,
    tamanhosize enum(
		"P",
		"M",
        "G",
        "GG"
	)not null,
    quantidade int not null,
    primary key(id),
    constraint fk_uniforme foreign key(uniforme_id) references uniforme(id)
    on delete cascade
    on update cascade
)engine = InnoDB
default charset = utf8mb4
collate = utf8mb4_unicode_ci;
