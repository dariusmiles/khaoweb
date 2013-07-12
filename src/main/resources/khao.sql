DROP DATABASE khaoweb;

CREATE DATABASE khaoweb;

CREATE TABLE customer
(
	id INT(11) NOT NULL,
	name varchar(45),
	email varchar(45),
	phone varchar(45),
	address varchar(45),
	city_region varchar(45),
	cc_number varchar(45),
	PRIMARY KEY (id)
);

CREATE TABLE category
(
	id INT(11) NOT NULL PRIMARY KEY,
	name varchar(45),
	PRIMARY KEY (id)
);

CREATE TABLE product
(
	id INT(11) NOT NULL,
	name varchar(45),
	price DECIMAL(5,2),
	description varchar(100),
	last_update timestamp,
	category_id,
	PRIMARY KEY (id),
	FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE customer_order
(
	id INT(11) NOT NULL,
	amount DECIMAL(6,2),
	date_created TIMESTAMP,
	confirmation_number INT(11),
	customer_id INT(11),
	PRIMARY KEY (id),
	CONSTRAINT fk_customer_order_customer FOREIGN KEY (customer_id) REFERENCES customer(id),	
);

CREATE TABLE ordered_product
(
	customer_order_id INT(11),
	product_id INT(11),
	quantity SMALLINT,
	CONSTRAINT fk_ordered_product_customer_order FOREIGN KEY (customer_order_id)
		REFERENCES customer_order(id),
	CONSTRAINT fk_ordered_product_product FOREIGN KEY (product_id)
		REFERENCES product(id)
);

