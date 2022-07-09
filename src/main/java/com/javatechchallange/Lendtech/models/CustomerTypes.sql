CREATE TABLE
    customertypes
    (
        id BIGINT NOT NULL,
        type VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    customertypes_sequence
    (
        next_val BIGINT
    );

INSERT INTO customertypes (id, type)
  VALUES (1, 'Person Customer');
INSERT INTO customertypes (id, type)
  VALUES (2, 'Corporate Customer');

INSERT INTO customertypes_sequence (next_val) VALUES (3);