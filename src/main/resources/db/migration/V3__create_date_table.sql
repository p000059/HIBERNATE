CREATE TABLE IF NOT EXISTS dates (
    id BIGINT PRIMARY KEY,
    initial_date TIMESTAMP NOT NULL,
    final_date TIMESTAMP,
    status BOOLEAN NOT NULL
);