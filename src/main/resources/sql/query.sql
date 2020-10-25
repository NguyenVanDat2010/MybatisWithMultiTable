create database multi_table;
use multi_table;

CREATE TABLE IF NOT EXISTS `user`
(
    `id`         int(11)     NOT NULL AUTO_INCREMENT,
    `name`       varchar(50) NOT NULL,
    `company_id` int(11)     NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `company`
(
    `id`   int(11)      NOT NULL AUTO_INCREMENT,
    `name` varchar(200) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `account`
(
    `id`      int(11)      NOT NULL AUTO_INCREMENT,
    `name`    varchar(200) NOT NULL,
    `user_id` int(11)      NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


INSERT INTO `user`
VALUES (1, 'aa', 1),
       (2, 'bb', 2);

INSERT INTO `company`
VALUES (1, 'xx company'),
       (2, 'yy company');

INSERT INTO `account`
VALUES (1, ' ', 1),
       (2, 'ICBC', 1),
       (3, ' ', 2);