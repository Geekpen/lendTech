CREATE TABLE
    customers
    (
        id BIGINT NOT NULL,
        customertype VARCHAR,
        name VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    customers_sequence
    (
        next_val BIGINT
    );

INSERT INTO customers (id, customertype, name)
  VALUES (1, 2, 'Jack Mah');
INSERT INTO customers (id, customertype, name)
  VALUES (2, 1, 'LendTech');
INSERT INTO customers (id, customertype, name)
  VALUES (3, 1, 'Albert Einsten');

INSERT INTO customers_sequence (next_val) VALUES (4);