DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products(id bigserial, title VARCHAR(255), price INTEGER, PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Milk', 10), ('Bread', 20), ('Apple', 30);

