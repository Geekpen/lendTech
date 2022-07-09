CREATE TABLE
    current_accounts
    (
        id BIGINT NOT NULL,
        customerid NUMERIC NOT NULL,
        account_balance NUMERIC,
        last_updated DATETIME,
        PRIMARY KEY (id)
    );

CREATE TABLE
    current_accounts_sequence
    (
        next_val BIGINT
    );

INSERT INTO current_accounts (id, customerid, account_balance, last_updated)
  VALUES (1, 1, 231442, '4419619200000');
INSERT INTO current_accounts (id, customerid, account_balance, last_updated)
  VALUES (2, 3, 34134, '4419619200000');
INSERT INTO current_accounts (id, customerid, account_balance, last_updated)
  VALUES (3, 2, 34522, '4419619200000');

INSERT INTO current_accounts_sequence (next_val) VALUES (4);