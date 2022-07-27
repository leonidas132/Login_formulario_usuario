
create database Usuario_jsp;
use Usuario_jsp;

create table credenciales(
 id varchar(10)not null primary key,
 usuario varchar (10)not null
);
insert into credenciales(id,usuario)values('12','user01');


select * from credenciales ;


select * from  credenciales where id = '01' and usuario ='user02'

select credenciales.usuario,formulario.nombre
from credenciales
inner join formulario on credenciales.id = formulario.id

delete from  where id= '10'


-----------------------------------------------------------------------------------------------


create table formulario(
   id varchar(10),
   numeroDoc varchar(11)not null,
   tipoDoc varchar(3)not null,
   nombre varchar(20)not null,
   apellido varchar(20)not null,
   fechaNacimiento date,
   foreign key(id) references credenciales(id)
);
alter table formulario
    modify column fechaNacimiento date;

select * from formulario

    insert into formulario(id,numeroDoc,tipoDoc,nombre,apellido,fechaNacimiento)
values('12','102325','DNI','JOSE','MORALES','2022/11/10')