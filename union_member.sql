-- Table: public.union_member

-- DROP TABLE IF EXISTS public.union_member;

CREATE TABLE IF NOT EXISTS public.union_member
(
    member_id integer NOT NULL,
    emp_id integer,
    union_id integer
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.union_member
    OWNER to postgres;

GRANT ALL ON TABLE public.union_member TO admin;

GRANT ALL ON TABLE public.union_member TO postgres;