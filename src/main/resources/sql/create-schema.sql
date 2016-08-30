--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: edu_details; Type: TABLE; Schema: public; Owner: hummingbird; Tablespace: 
--

CREATE TABLE edu_details (
    userid character varying(255) NOT NULL,
    intaggregate real,
    intbranch character varying(255),
    intdegree character varying(255),
    intinstitute character varying(255),
    intlocation character varying(255),
    intstate character varying(255),
    intuniversity character varying(255),
    intyearofpass integer,
    pgaggregate real,
    pgbranch character varying(255),
    pgdegree character varying(255),
    pginstitute character varying(255),
    pglocation character varying(255),
    pgstate character varying(255),
    pguniversity character varying(255),
    pgyearofpass integer,
    tenthaggregate real,
    tenthinstitute character varying(255),
    tenthlocation character varying(255),
    tenthstate character varying(255),
    tenthuniversity character varying(255),
    tenthyearofpass integer,
    ugaggregate real,
    ugbranch character varying(255),
    ugdegree character varying(255),
    uginstitute character varying(255),
    uglocation character varying(255),
    ugstate character varying(255),
    uguniversity character varying(255),
    ugyearofpass integer
);


ALTER TABLE edu_details OWNER TO hummingbird;

--
-- Name: jobposts; Type: TABLE; Schema: public; Owner: hummingbird; Tablespace: 
--

CREATE TABLE jobposts (
    jobid character varying(255) NOT NULL,
    contact character varying(255),
    qualification character varying(255),
    experience character varying(255),
    jobdescription character varying(255),
    jobfield character varying(255),
    location character varying(255),
    jobpostdate character varying(255),
    jobrole character varying(255),
    jobtype character varying(255),
    noofvacancies character varying(255),
    salarypay character varying(255),
    skill character varying(255),
    yearofpassing character varying(255)
);


ALTER TABLE jobposts OWNER TO hummingbird;

--
-- Name: jobroles; Type: TABLE; Schema: public; Owner: hummingbird; Tablespace: 
--

CREATE TABLE jobroles (
    id bigint NOT NULL,
    empid character varying(255),
    jobid character varying(255),
    jobname character varying(255)
);


ALTER TABLE jobroles OWNER TO hummingbird;

--
-- Name: perdet; Type: TABLE; Schema: public; Owner: hummingbird; Tablespace: 
--

CREATE TABLE perdet (
    userid character varying(255) NOT NULL,
    addrline1 character varying(255),
    addrline12 character varying(255),
    addrline2 character varying(255),
    addrline22 character varying(255),
    dist character varying(255),
    dist2 character varying(255),
    birthdate character varying(255),
    ch1 character varying(255),
    city character varying(255),
    city2 character varying(255),
    firstname character varying(255),
    lastname character varying(255),
    mstatus character varying(255),
    mobilenum character varying(255),
    pin character varying(255),
    pin2 character varying(255),
    sex character varying(255),
    states character varying(255),
    state2 character varying(255),
    uemail character varying(255)
);


ALTER TABLE perdet OWNER TO hummingbird;

--
-- Name: skills_and_achievements; Type: TABLE; Schema: public; Owner: hummingbird; Tablespace: 
--

CREATE TABLE skills_and_achievements (
    userid character varying(255) NOT NULL,
    cpp integer,
    cprogramming integer,
    databases integer,
    html integer,
    hardwareconcepts integer,
    java integer,
    networking integer,
    softwareengineering integer,
    testingmethodologies integer,
    unix integer,
    xml integer,
    academic_achievements character varying(255),
    cocurricular_achievements character varying(255),
    cursal character varying(255),
    experience_in_months integer,
    experience_in_years integer,
    experience_or_fresher character varying(255),
    expsal character varying(255),
    indname character varying(255),
    jobrole1 character varying(255),
    orgname character varying(255),
    uploadfilefilename character varying(255)
);


ALTER TABLE skills_and_achievements OWNER TO hummingbird;

--
-- Name: ulogin; Type: TABLE; Schema: public; Owner: hummingbird; Tablespace: 
--

CREATE TABLE ulogin (
    username character varying(255) NOT NULL,
    id1 character varying(255),
    userpassword character varying(255),
    verify character varying(255)
);


ALTER TABLE ulogin OWNER TO hummingbird;

--
-- Name: edu_details_pkey; Type: CONSTRAINT; Schema: public; Owner: hummingbird; Tablespace: 
--

ALTER TABLE ONLY edu_details
    ADD CONSTRAINT edu_details_pkey PRIMARY KEY (userid);


--
-- Name: jobposts_pkey; Type: CONSTRAINT; Schema: public; Owner: hummingbird; Tablespace: 
--

ALTER TABLE ONLY jobposts
    ADD CONSTRAINT jobposts_pkey PRIMARY KEY (jobid);


--
-- Name: jobroles_pkey; Type: CONSTRAINT; Schema: public; Owner: hummingbird; Tablespace: 
--

ALTER TABLE ONLY jobroles
    ADD CONSTRAINT jobroles_pkey PRIMARY KEY (id);


--
-- Name: perdet_pkey; Type: CONSTRAINT; Schema: public; Owner: hummingbird; Tablespace: 
--

ALTER TABLE ONLY perdet
    ADD CONSTRAINT perdet_pkey PRIMARY KEY (userid);


--
-- Name: skills_and_achievements_pkey; Type: CONSTRAINT; Schema: public; Owner: hummingbird; Tablespace: 
--

ALTER TABLE ONLY skills_and_achievements
    ADD CONSTRAINT skills_and_achievements_pkey PRIMARY KEY (userid);


--
-- Name: ulogin_pkey; Type: CONSTRAINT; Schema: public; Owner: hummingbird; Tablespace: 
--

ALTER TABLE ONLY ulogin
    ADD CONSTRAINT ulogin_pkey PRIMARY KEY (username);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

