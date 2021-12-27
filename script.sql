create database bd_inv;
use bd_inv;

create table tblrol(
idRol int primary key auto_increment not null,
nombre varchar(100) not null
);

create table tblUsuario(
idUsuario int primary key auto_increment not null,
nombre varchar(100) not null,
apellido varchar(100) not null,
idRol int not null,
matricula varchar(9) not null UNIQUE,
pass varchar(9) not null,
foreign key(idRol) references tblrol(idRol)
);



create table tblCategorlistadoMaterialia(
idCategoria int primary key auto_increment not null,
nombreCate  varchar(30) not null
);

create table tblsubCategoria(
idSubCategoria int primary key auto_increment not null,
nombreSubCate  varchar(30) not null
);

create table tblCateSubCate(
idCateSub int primary key auto_increment not null,
idCategoria int  not null,
idSubCategoria int  ,
foreign key(idCategoria) references tblCategoria(idCategoria),
foreign key(idSubCategoria) references tblsubCategoria(idSubCategoria)
);
create table tblMaterial(
idMaterial int primary key auto_increment not null,
nombre varchar(40) not null,
civeq varchar(10)  null,
kimax varchar(10)  null,
sinMarca varchar(10)  null,
pirex varchar(10)  null,
simax varchar(10)  null,
brand varchar(10)  null,
schott_duran varchar(30)  null,
pkMexico varchar(10)  null,
superiekborosilicate varchar(10)  null,
glass varchar(10)  null,
p_e varchar(10)  null,
volumen varchar(10)  null,
cantidad int not null,
ubicación varchar(10)  null,
observaciones varchar(40)  null,
idCateSub int not null,
foreign key(idCateSub) references tblCateSubCate(idCateSub)
)