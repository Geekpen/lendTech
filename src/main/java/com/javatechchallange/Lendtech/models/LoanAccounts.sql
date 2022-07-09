CREATE TABLE
    loan_accounts
    (
        id BIGINT NOT NULL,
        customerid NUMERIC NOT NULL,
        account_balance NUMERIC,
        last_updated DATETIME,
        PRIMARY KEY (id)
    );

CREATE TABLE
    loan_accounts_sequence
    (
        next_val BIGINT
    );

INSERT INTO loan_accounts (id, customerid, account_balance, last_updated)
  VALUES (1, 1, 3454, '4419619200000');
INSERT INTO loan_accounts (id, customerid, account_balance, last_updated)
  VALUES (2, 3, 45256, '4419619200000');
INSERT INTO loan_accounts (id, customerid, account_balance, last_updated)
  VALUES (3, 2, 346455, '4419619200000');

INSERT INTO loan_accounts_sequence (next_val) VALUES (4);