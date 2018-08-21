CREATE TABLE person
 (
 person_id INT NULL DEFAULT NULL,
 name VARCHAR(50) NULL DEFAULT NULL,
 CONSTRAINT person_primary_key PRIMARY KEY (person_id)
 )

-- Table: public.phonenumber

CREATE TABLE public.phonenumber
(
  phone_number_id integer NOT NULL,
  phone_number integer NOT NULL,
  personid integer NOT NULL,
  CONSTRAINT phone_number_id PRIMARY KEY (phone_number_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.phonenumber
  OWNER TO postgres;
ALTER TABLE public.phonenumber
ADD FOREIGN KEY (personid) REFERENCES person(person_id);