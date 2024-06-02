-- Table: public.Employee

-- DROP TABLE IF EXISTS public."Employee";

CREATE TABLE IF NOT EXISTS public."Employee"
(
    employee_id integer,
    name "char"[],
    address "char"[],
    emp_type "char"[] NOT NULL,
    payment_method "char"[]
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Employee"
    OWNER to postgres;

GRANT ALL ON TABLE public."Employee" TO admin;

GRANT ALL ON TABLE public."Employee" TO postgres;

COMMENT ON COLUMN public."Employee".emp_type
    IS '[H-Hourly Rated, S-Salaried, C- Monthly Commission Rated]';

COMMENT ON COLUMN public."Employee".payment_method
    IS '[paycheck, bank_deposit]';