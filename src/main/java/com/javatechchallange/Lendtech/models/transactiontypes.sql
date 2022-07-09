CREATE TABLE
    transactiontypes
    (
        id BIGINT NOT NULL,
        type VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    transactiontypes_sequence
    (
        next_val BIGINT
    );

INSERT INTO transactiontypes (id, type)
  VALUES (1, 'Loan Request');
INSERT INTO transactiontypes (id, type)
  VALUES (2, 'Send Money');
INSERT INTO transactiontypes (id, type)
  VALUES (3, 'Send To Bank');
INSERT INTO transactiontypes (id, type)
  VALUES (4, 'Sent From Bank');

INSERT INTO transactiontypes_sequence (next_val) VALUES (5);