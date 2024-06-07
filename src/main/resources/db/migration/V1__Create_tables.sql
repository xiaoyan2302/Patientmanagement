CREATE TABLE patient (
                           id              BIGSERIAL NOT NULL,
                           name            VARCHAR(30),
                           dob             VARCHAR(30),
                           phonenumber     VARCHAR(30),
                           address         VARCHAR(30)
);
ALTER TABLE patient ADD CONSTRAINT patient_pk PRIMARY KEY ( id );

CREATE TABLE prescription (
                          id             BIGSERIAL NOT NULL,
                          patient_id     BIGSERIAL NOT NULL,
                          rx_number      VARCHAR(100),
                          rx_date        VARCHAR(100),
                          rx_prescriber  Varchar(100),
                          rx_name        VARCHAR(100),
                          rx_qty         VARCHAR(100),
                          rx_refill      varchar(10),
                          rx_description varchar(100)

);
ALTER TABLE prescription ADD CONSTRAINT prescription_pk PRIMARY KEY ( id );

CREATE TABLE inventory (
                             ndc_number      VARCHAR(100),
                             med_name        VARCHAR(30),
                             med_qty         Varchar(100)

);
ALTER TABLE inventory ADD CONSTRAINT inventory_pk PRIMARY KEY ( ndc_number );

ALTER TABLE prescription
    ADD CONSTRAINT prescription_patient_fk FOREIGN KEY (patient_id)
        REFERENCES patient ( id );

