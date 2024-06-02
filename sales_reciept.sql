-- Table: public.sales_reciept

-- DROP TABLE IF EXISTS public.sales_reciept;

CREATE TABLE IF NOT EXISTS public.sales_reciept
(
    emp_id integer,
    entry_date date,
    amount double precision
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.sales_reciept
    OWNER to postgres;

GRANT ALL ON TABLE public.sales_reciept TO admin;

GRANT ALL ON TABLE public.sales_reciept TO postgres;