CREATE TABLE
    transactions
    (
        id BIGINT NOT NULL,
        transactiontype INT,
        from_customerid INT,
        to_customerid INT,
        to_account_type INT NOT NULL,
        amount NUMERIC,
        account_balance NUMERIC,
        transaction_date DATETIME,
        PRIMARY KEY (id)
    );

CREATE TABLE
    transactions_sequence
    (
        next_val BIGINT
    );

INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (1, 1, 2, 1,1,200,3774, '4419619200000');
INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (2, 3, 2, 3,2,1000,489, '4419619200000');
INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (3, 2, 3, 1,2,2342,388, '4419619200000');

INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (4, 1, 1, 2,1,4234,47892, '4419619200000');
INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (5, 3, 1, 3,2,3424,89, '4419619200000');
INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (6, 2, 1, 3,2,887,4892, '4419619200000');

INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (7, 1, 1, 2,1,834,4892, '4419619200000');
INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (8, 3, 1, 2,2,245,1000, '4419619200000');
INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (9, 2, 1, 2,2,2342,2000, '4419619200000');

  INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (10, 1, 1, 3,1,1457,34902, '4419619200000');
INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (11, 3, 1, 3,2,345, '4419619200000');
INSERT INTO transactions (id, transactiontype, from_customerid, to_customerid, to_account_type, amount, account_balance, transaction_date)
  VALUES (12, 2, 1, 3,2,9775, '4419619200000');

INSERT INTO transactions_sequence (next_val) VALUES (13);