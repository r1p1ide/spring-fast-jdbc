CREATE TABLE IF NOT EXISTS purchase (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    product varchar(50) NOT NULL,
    price double NOT NULL
);