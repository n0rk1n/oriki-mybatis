CREATE SCHEMA `db_mybatis`
  DEFAULT CHARACTER SET utf8;

CREATE TABLE `db_mybatis`.`t_country` (
  `id`   INT          NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(256) NULL,
  `code` VARCHAR(8)   NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `db_mybatis`.`t_country`
(`name`,
 `code`)
VALUES
  ('中国', 'CN');
INSERT INTO `db_mybatis`.`t_country`
(`name`,
 `code`)
VALUES
  ('美国', 'US');
INSERT INTO `db_mybatis`.`t_country`
(`name`,
 `code`)
VALUES
  ('英国', 'GB');
INSERT INTO `db_mybatis`.`t_country`
(`name`,
 `code`)
VALUES
  ('法国', 'FR');
