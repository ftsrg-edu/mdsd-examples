create table Car (
	plateNumber varchar(50) primary key
	numberOfDoors integer 
)

create table Pilot (
	Licence varchar(50) 
	IDN integer primary key
	name varchar(50) 
)

create table CarType (
	name varchar(50) primary key
)

create table Plane (
	serialNumber varchar(50) primary key
	nick varchar(50) 
)

create table PlaneType (
	name varchar(50) primary key
)

create table Person (
	IDN integer primary key
	name varchar(50) 
)

create table CarTypeRelation (
	id integer primary key
	name varchar(50) foreign key (name)
	plateNumber varchar(50) foreign key (plateNumber)
)

create table PlanesDrivenByPilotsRelation (
	id integer primary key
	serialNumber varchar(50) foreign key (serialNumber)
	IDN integer foreign key (IDN)
)

create table CarsDrivenByPeopleRelation (
	id integer primary key
	IDN integer foreign key (IDN)
	plateNumber varchar(50) foreign key (plateNumber)
)

create table PlaneTypeRelation (
	id integer primary key
	name varchar(50) foreign key (name)
	serialNumber varchar(50) foreign key (serialNumber)
)

