CREATE TABLE city (
    id VARCHAR(36) PRIMARY KEY,
    id_country varchar(36),
    name varchar(100) NOT NULL,
    population INT NOT NULL,
    capital boolean not null,
    FOREIGN KEY (id_country) REFERENCES country(id)
);