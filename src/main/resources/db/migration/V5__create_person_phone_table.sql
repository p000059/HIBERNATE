CREATE TABLE IF NOT EXISTS person_phone (
    person_id BIGINT NOT NULL,
    phone_id BIGINT NOT NULL,
    PRIMARY KEY (person_id, phone_id),
    FOREIGN KEY (person_id) REFERENCES person(id),
    FOREIGN KEY (phone_id) REFERENCES phone(id)
);

