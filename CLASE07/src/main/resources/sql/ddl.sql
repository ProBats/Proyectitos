-- data definicion lenguaje
drop database if exists bolsa;
create database bolsa;
use bolsa;
create table candidato(
	id int auto_increment primary key,
    apellidos varchar(30) not null check (length(apellidos) >= 3),
    nombres varchar(30) not null check (length(nombres) >= 3),
    tipo_documento enum('DNI','PASS'),
    numero_documento varchar(12), check (length(numero_documento) >= 5),
    fenaci date not null check (fenaci<'2010/01/01'),
    estudios_primarios enum('S','N'),
    estudios_secundario enum('S','N'),
    estudios_terciario enum('S','N'),
    estudios_universitario enum('S','N'),
    estudios_primarios_colegio varchar(100),
    estudios_secundarios_colegio varchar(100),
    estudios_terciarios_colegio varchar(100),
    estudios_universitarios_universidad varchar(100),
    estudios_secundarios_titulo varchar(100),
    estudios_terciarios_titulo varchar(100),
    estudios_universitarios_titulo varchar(100),
    idiomas varchar(100),
    habilidades varchar(250),
    perfil_laboral varchar(100),
    direccion varchar(255),
    telefono varchar(20),
    email varchar(50)

);
create table empresa(
    id_empresa int auto_increment primary key,
    nombre_empresa varchar(50) not null check(length(nombre_empresa)>=2),
    direccion varchar(255),
    ubicacion varchar(255),
    telefono varchar(20),
    email varchar(50),
    sitio_web varchar(255),
    descripcion varchar(500),
    productos_servicios varchar(255),
    id_empleado int,
    foreing key(id_empleado) REFERENCES candidato(id)
)