DROP TABLE example IF EXISTS;

CREATE TABLE data
(
  id       BIGINT IDENTITY NOT NULL PRIMARY KEY,
  cve_data VARCHAR(20),
  ds_data  VARCHAR(20)
);