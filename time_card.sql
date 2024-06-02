-- Table: public.time_card

-- DROP TABLE IF EXISTS public.time_card;

CREATE TABLE IF NOT EXISTS public.time_card
(
    emp_id integer NOT NULL,
    entry_date date,
    hours integer,
    CONSTRAINT time_card_pkey PRIMARY KEY (emp_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.time_card
    OWNER to postgres;

GRANT ALL ON TABLE public.time_card TO admin;

GRANT ALL ON TABLE public.time_card TO postgres;