-- Table: public.Union

-- DROP TABLE IF EXISTS public."Union";

CREATE TABLE IF NOT EXISTS public."Union"
(
    union_id integer,
    name "char"[],
    service_charge double precision
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Union"
    OWNER to postgres;

GRANT ALL ON TABLE public."Union" TO admin;

GRANT ALL ON TABLE public."Union" TO postgres;