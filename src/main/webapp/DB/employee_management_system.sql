create database webprojects;
use webprojects;

create table users(
email varchar(20) primary key,
password varchar(20) not null
);

create table employees(

empId int primary key auto_increment,
name varchar(20),
age int,
email varchar(20) unique,
phone_number varchar(20),
salary decimal(10,2)
);
