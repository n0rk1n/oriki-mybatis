USE db_mybatis;
CREATE TABLE IF NOT EXISTS `t_person` (
  `id`   INT         NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `t_identity_card` (
  `id`        INT         NOT NULL,
  `id_number` VARCHAR(18) NULL,
  INDEX `fk_t_identity_card_t_person_idx` (`id` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_t_identity_card_t_person`
  FOREIGN KEY (`id`)
  REFERENCES `t_person` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
  ENGINE = InnoDB;

INSERT INTO t_person VALUES (1, 'zhangsan');
INSERT INTO t_identity_card VALUE (1, '123456789012345678')

