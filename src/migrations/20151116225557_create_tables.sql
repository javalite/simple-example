# noinspection SqlNoDataSourceInspectionForFile

CREATE TABLE movies (
  id    INT(11) NOT NULL AUTO_INCREMENT,
  title TEXT,
  year  INT(11),
    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

CREATE TABLE people (
  id   INT(11) NOT NULL AUTO_INCREMENT,
  name TEXT,
    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

CREATE TABLE movies_people (
  id        INT(11) NOT NULL AUTO_INCREMENT,
  movie_id  INTEGER NOT NULL,
  person_id INTEGER NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
