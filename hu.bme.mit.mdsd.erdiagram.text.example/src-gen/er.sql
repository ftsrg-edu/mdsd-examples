CREATE TABLE person (
	id int PRIMARY KEY, 
	name varchar(255) 
);
CREATE TABLE driver (
	licence varchar(255),  
	id int,  
	name varchar(255) 
);
CREATE TABLE car (
	numberPlate varchar(255) PRIMARY KEY
);
CREATE TABLE personTocar (
	id int,
	CONSTRAINT fk_id FOREIGN KEY (id)
		REFERENCES person(id),
	numberPlate varchar(255),
	CONSTRAINT fk_numberPlate FOREIGN KEY (numberPlate)
		REFERENCES car(numberPlate)
);
