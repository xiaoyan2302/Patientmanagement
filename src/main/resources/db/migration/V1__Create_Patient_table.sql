CREATE TABLE patient (
                           id              BIGSERIAL NOT NULL,
                           name            VARCHAR(30),
                           dob             VARCHAR(30),
                           phonenumber     VARCHAR(30),
                           address         VARCHAR(30)
);
ALTER TABLE patient ADD CONSTRAINT patient_pk PRIMARY KEY ( id );



CREATE TABLE inventory (
                             ndc_number      VARCHAR(100),
                             med_name        VARCHAR(30),
                             med_qty         Varchar(100)

);
ALTER TABLE inventory ADD CONSTRAINT inventory_pk PRIMARY KEY ( ndc_number );

ALTER TABLE prescription
    ADD CONSTRAINT prescription_patient_fk FOREIGN KEY (patient_id)
        REFERENCES patient ( id );

