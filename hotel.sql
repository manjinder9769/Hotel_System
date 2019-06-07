create database project;
use project;
create table hotel(
Customer int(20) primary key,
Firstname varchar(20),
Lastname varchar(20),
Address1 varchar (30),
Address2 varchar (30),
Mobile int(20),
Email varchar(30),
Nationality varchar(40),
Date_Of_Birth varchar(40),
Gender varchar(10),
Check_In_Date varchar(30),
Check_Out_Date varchar(30),
Room_Type varchar(30),
Room_Number int(5),
Id_type varchar(20)
);
desc hotel;
select * from hotel;
delete from hotel where customer = 256;

delete from hotel where customer = 1234;
