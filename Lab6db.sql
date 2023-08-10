DROP DATABASE lab6db;
CREATE DATABASE lab6db;
USE lab6db;

INSERT INTO students(id,first_name,last_name,course,country)
 VALUES(1,'Suresh','Reddy','B.Tech','India'),
	   (2,'Murali','Mohan','B.Arch','Canada'),
       (3,'Daniel','Denson','B.Tech','NewZeland'),
       (4,'Tanya','Gupta','B.Com','USA');
INSERT INTO roles(role_id,name)
VALUES(1,'ADMIN'),
	  (2,'USER'); 
INSERT INTO users(user_id,password,username)
VALUES(1,'$2a$12$5M/GnhsFysSTgJpoEwY7J.MG9xW6B8tfYLZM6mLBNVH7CFb7i0yBi','admin'),
	  (2,'$2a$12$hkvazAlqn7TnOtESFLlS8uudiU4czK30n3OuSna91yZyB9mQfuSpy','user');
      
INSERT INTO users_roles(user_id,role_id)
VALUES(1,1),
	  (2,2);