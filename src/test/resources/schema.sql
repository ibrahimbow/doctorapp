CREATE TABLE doctors
(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(255) DEFAULT NULL,
    specialist VARCHAR(255) DEFAULT NULL,
    email VARCHAR(255) DEFAULT NULL
);