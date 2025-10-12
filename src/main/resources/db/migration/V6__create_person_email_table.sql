CREATE TABLE IF NOT EXISTS person_email (
    person_id BIGINT NOT NULL,
    email_id BIGINT NOT NULL,
    PRIMARY KEY (person_id, email_id),
    FOREIGN KEY (person_id) REFERENCES person(id),
    FOREIGN KEY (email_id) REFERENCES email(id)
);
