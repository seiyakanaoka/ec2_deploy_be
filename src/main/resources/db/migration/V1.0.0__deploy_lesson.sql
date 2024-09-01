CREATE TABLE IF NOT EXISTS user (
  user_id varchar(11) NOT NULL,
  email varchar(256) UNIQUE NOT NULL,
  password varchar(128) NOT NULL,
  name varchar(32) NOT NULL,
  role_type enum('ADMIN', 'CLIENT'),
  PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO
    user
VALUES
    ('U0000000000', 'test1@example.com', 'password1', 'name1', 'ADMIN')
    , ('U0000000001', 'test2@example.com', 'password2', 'name2', 'CLIENT')
    , ('U0000000002', 'test3@example.com', 'password3', 'name3', 'ADMIN')
    , ('U0000000003', 'test4@example.com', 'password3', 'name3', 'CLIENT')
;

CREATE TABLE IF NOT EXISTS whisky (
  whisky_id varchar(11) NOT NULL,
  name varchar(32) NOT NULL,
  PRIMARY KEY (whisky_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO
    whisky
VALUES
    ('W0000000000', '白州')
    , ('W0000000001', '山崎')
    , ('W0000000002', '響')
    , ('W0000000003', '知多')
;

CREATE TABLE IF NOT EXISTS whisky_taste (
  whisky_taste_id varchar(12) NOT NULL,
  whisky_id varchar(11) NOT NULL,
  sweet tinyint NOT NULL,
  vanilla_flavor tinyint NOT NULL,
  smokey tinyint NOT NULL,
  spicy tinyint NOT NULL,
  strong tinyint NOT NULL,
  PRIMARY KEY (whisky_taste_id),
  FOREIGN KEY (whisky_id) REFERENCES whisky(whisky_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO
    whisky_taste
VALUES
    ('WT0000000000', 'W0000000000', 1, 2, 3, 4, 5)
    , ('WT0000000001', 'W0000000001', 2, 3, 4, 5, 6)
    , ('WT0000000002', 'W0000000002', 3, 4, 5, 6, 7)
    , ('WT0000000003', 'W0000000003', 4, 5, 6, 7, 8)
;
