
CREATE TABLE beer (
	id int AUTO_INCREMENT primary key,
	name varchar(255) NOT NULL,
	type varchar(255) NOT NULL,
	price varchar(255) NOT NULL,
    ml varchar(255) NOT NULL,
    alcool varchar(255) NOT NULL,
    ph varchar(255) NOT NULL,
    producer varchar(255) NOT NULL
);

insert into beer(name,type,price,ml,alcool,ph,producer) values ('skol','noob','1.00','250','0.7%','-2'.'Carlsberg');