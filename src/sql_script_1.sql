-- -----------------------------------------------------
-- Schema store
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS store DEFAULT CHARACTER SET utf8 ;
USE store ;

-- -----------------------------------------------------
-- Table store.salesman
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS store.salesman (
  sman_id INT NOT NULL AUTO_INCREMENT,
  sman_name VARCHAR(20) NOT NULL,
  sman_ltname VARCHAR(20) NOT NULL,
  sman_id_doc VARCHAR(13) NOT NULL,
  create_at DATETIME NOT NULL,
  update_at DATETIME NULL,
  delete_at DATETIME NULL,
  PRIMARY KEY (sman_id),
  UNIQUE INDEX sman_id_doc_UNIQUE (sman_id_doc ASC, sman_ltname ASC, sman_name ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table store.customer
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS store.customer (
  cusmer_id INT NOT NULL AUTO_INCREMENT,
  cusmer_type_id CHAR(5) NOT NULL,
  cusmer_id_doc VARCHAR(12) NOT NULL,
  create_at DATETIME NOT NULL,
  update_at DATETIME NULL,
  delete_at DATETIME NULL,
  PRIMARY KEY (cusmer_id),
  UNIQUE INDEX cusmer_id_doc_UNIQUE (cusmer_id_doc ASC, cusmer_type_id ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table store.product
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS store.product (
  prd_id INT NOT NULL AUTO_INCREMENT,
  prd_name VARCHAR(30) NOT NULL,
  prd_type VARCHAR(15) NOT NULL,
  prd_quantity INT NOT NULL,
  prd_price DOUBLE NOT NULL,
  create_at DATETIME NOT NULL,
  update_at DATETIME NULL,
  delete_at DATETIME NULL,
  PRIMARY KEY (prd_id),
  UNIQUE INDEX prd_name_UNIQUE (prd_name ASC, prd_type ASC) INVISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table store.provider
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS store.provider (
  pder_id INT NOT NULL AUTO_INCREMENT,
  pder_name VARCHAR(30) NOT NULL,
  pder_nit VARCHAR(15) NOT NULL,
  pder_phone VARCHAR(13) NOT NULL,
  create_at DATETIME NOT NULL,
  update_at DATETIME NULL,
  delete_at DATETIME NULL,
  PRIMARY KEY (pder_id),
  UNIQUE INDEX pder_nit_UNIQUE (pder_nit ASC, pder_name ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table store.sale
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS store.sale (
  sale_id INT NOT NULL AUTO_INCREMENT,
  salesman_sman_id INT NOT NULL,
  customer_cusmer_id INT NOT NULL,
  sale_type VARCHAR(10) NOT NULL,
  sale_status VARCHAR(10) NOT NULL,
  create_at DATETIME NOT NULL,
  delete_at DATETIME NULL,
  PRIMARY KEY (sale_id),
  INDEX fk_sale_salesman1_idx (salesman_sman_id ASC) INVISIBLE,
  INDEX fk_sale_customer1_idx (customer_cusmer_id ASC) VISIBLE,
  CONSTRAINT fk_sale_salesman1
    FOREIGN KEY (salesman_sman_id)
    REFERENCES store.salesman (sman_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_sale_customer1
    FOREIGN KEY (customer_cusmer_id)
    REFERENCES store.customer (cusmer_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table store.sale_has_product
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS store.sale_has_product (
  sale_sale_id INT NOT NULL,
  product_prd_id INT NOT NULL,
  INDEX fk_sale_has_product_product1_idx (product_prd_id ASC) VISIBLE,
  INDEX fk_sale_has_product_sale1_idx (sale_sale_id ASC) VISIBLE,
  CONSTRAINT fk_sale_has_product_sale1
    FOREIGN KEY (sale_sale_id)
    REFERENCES store.sale (sale_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_sale_has_product_product1
    FOREIGN KEY (product_prd_id)
    REFERENCES store.product (prd_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table store.provider_has_product
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS store.provider_has_product (
  provider_pder_id INT NOT NULL,
  product_prd_id INT NOT NULL,
  INDEX fk_provider_has_product_provider1_idx (provider_pder_id ASC) VISIBLE,
  INDEX fk_provider_has_product_product1_idx (product_prd_id ASC) VISIBLE,
  CONSTRAINT fk_provider_has_product_provider1
    FOREIGN KEY (provider_pder_id)
    REFERENCES store.provider (pder_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT fk_provider_has_product_product1
    FOREIGN KEY (product_prd_id)
    REFERENCES store.product (prd_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Insert data into store.customer
-- -----------------------------------------------------
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('CC', '7568688645', '2022-01-28 08:08:10');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('TI', '1035484892', '2022-03-02 04:26:38');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('CC', '7866945479', '2021-11-21 20:14:15');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('CC', '9918276077', '2021-08-02 17:46:26');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('CC', '2107396413', '2021-07-28 19:03:17');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('CC', '5177091952', '2021-07-17 13:25:31');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('CC', '7789777069', '2022-03-01 11:19:17');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('CC', '4145137504', '2021-04-13 10:04:06');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('CC', '5131104935', '2021-06-28 11:25:32');
insert into customer 
    (cusmer_type_id, cusmer_id_doc, create_at) 
    values ('TI', '1208790308', '2021-03-12 09:03:41');


-- -----------------------------------------------------
-- Insert data into store.salesman
-- -----------------------------------------------------
insert into salesman 
    (sman_name, sman_ltname, sman_id_doc, create_at) 
    values ('Bryon', 'Kenrack', '4590795064', '2021-03-31 21:38:12');
insert into salesman 
    (sman_name, sman_ltname, sman_id_doc, create_at) 
    values ('Coreen', 'Mabbutt', '8135687738', '2021-11-11 19:19:16');


-- -----------------------------------------------------
-- Insert data into store.provider
-- -----------------------------------------------------
insert into provider 
    (pder_name, pder_nit, pder_phone, create_at) 
    values ('JumpXS', '031824301-5', '119 696 4240', '2021-08-20 23:56:13');
insert into provider 
    (pder_name, pder_nit, pder_phone, create_at) 
    values ('Mydo', '412254985-0', '327 193 3567', '2021-10-02 20:35:25');


-- -----------------------------------------------------
-- Insert data into store.product
-- -----------------------------------------------------
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Orange', 'Fruits', '9', '6.5', '2021-06-09 17:20:12');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Banana', 'Fruits', '7', '1.3', '2021-04-26 19:28:43');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Coconut', 'Fruits', '2', '4.2', '2021-10-22 20:48:21');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Onion', 'Vegetables', '2', '8.2', '2022-02-22 03:23:24');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Potato', 'Vegetables', '8', '7.3', '2022-02-12 21:14:54');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Rice', 'Non-perishable', '9', '6.7', '2021-03-05 20:51:00');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Oil', 'Non-perishable', '9', '9.8', '2022-02-07 22:05:58');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Milk', 'Perishable', '4', '13.0', '2021-12-06 08:32:34');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Cookies', 'Perishables', '10', '1.1', '2021-07-02 18:57:50');
insert into product 
    (prd_name, prd_type, prd_quantity, prd_price, create_at) 
    values ('Cheese', 'Dairy products', '1', '8.3', '2021-04-25 00:57:29');


-- -----------------------------------------------------
-- Insert data into store.provider_has_product
-- -----------------------------------------------------
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 1);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 2);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 3);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 4);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 5);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 6);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 7);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 8);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 9);
insert into provider_has_product (provider_pder_id, product_prd_id) values (1, 10);


-- -----------------------------------------------------
-- Insert data into store.sale
-- -----------------------------------------------------
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 9, 'Credit', 'Accepted', '2021-09-19 11:12:01');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 6, 'Debit', 'Accepted', '2021-03-07 08:16:04');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 5, 'Debit', 'Accepted', '2021-12-15 01:56:11');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 3, 'Credit', 'Accepted', '2022-01-05 13:32:08');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 2, 'Debit', 'Accepted', '2022-01-10 03:45:46');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 6, 'Debit', 'Accepted', '2021-12-19 02:21:53');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 8, 'Credit', 'Accepted', '2021-05-27 14:51:13');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 7, 'Credit', 'Accepted', '2022-02-19 04:24:52');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 2, 'Credit', 'Accepted', '2021-10-16 15:50:48');
insert into sale 
    (salesman_sman_id, customer_cusmer_id, sale_type, sale_status, create_at) 
    values (1, 4, 'Credit', 'Accepted', '2021-04-14 09:03:03');


-- -----------------------------------------------------
-- Insert data into store.sale_has_product
-- -----------------------------------------------------
insert into sale_has_product (sale_sale_id, product_prd_id) values (1, 7);
insert into sale_has_product (sale_sale_id, product_prd_id) values (1, 8);
insert into sale_has_product (sale_sale_id, product_prd_id) values (1, 1);
insert into sale_has_product (sale_sale_id, product_prd_id) values (2, 1);
insert into sale_has_product (sale_sale_id, product_prd_id) values (2, 5);
insert into sale_has_product (sale_sale_id, product_prd_id) values (2, 6);
insert into sale_has_product (sale_sale_id, product_prd_id) values (3, 4);
insert into sale_has_product (sale_sale_id, product_prd_id) values (3, 3);
insert into sale_has_product (sale_sale_id, product_prd_id) values (4, 8);
insert into sale_has_product (sale_sale_id, product_prd_id) values (4, 7);
insert into sale_has_product (sale_sale_id, product_prd_id) values (9, 5);
insert into sale_has_product (sale_sale_id, product_prd_id) values (9, 2);
insert into sale_has_product (sale_sale_id, product_prd_id) values (10, 3);
insert into sale_has_product (sale_sale_id, product_prd_id) values (10, 4);


-- -----------------------------------------------------
-- First physical delete
-- -----------------------------------------------------
delete shp, sl 
    from sale_has_product shp 
    join sale sl 
    on sl.sale_id = shp.sale_sale_id  
    where shp.sale_sale_id = 10;

-- -----------------------------------------------------
-- Second physical delete
-- -----------------------------------------------------
delete shp, sl 
    from sale_has_product shp 
    join sale sl 
    on sl.sale_id = shp.sale_sale_id  
    where shp.sale_sale_id = 9;

-- -----------------------------------------------------
-- First logical delete
-- -----------------------------------------------------
UPDATE sale 
    SET deleted_at = now() 
    WHERE sale_id = 10;
-- -----------------------------------------------------
-- Second logical delete
-- -----------------------------------------------------
UPDATE sale 
    SET deleted_at = now() 
    WHERE sale_id = 9;

-- -----------------------------------------------------
-- Modify product names and provider ids
-- -----------------------------------------------------
update product, provider_has_product 
    set prd_name = 'Almond milk', provider_pder_id = 2 
    where prd_id = 8 and product_prd_id = 8;

update product, provider_has_product 
    set prd_name = 'ChocoGol', provider_pder_id = 2 
    where prd_id = 9 and product_prd_id = 9;

update product, provider_has_product 
    set prd_name = 'Goat Cheese', provider_pder_id = 2 
    where prd_id = 10 and product_prd_id = 10;