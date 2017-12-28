CREATE SCHEMA `db_mybatis`
  DEFAULT CHARACTER SET utf8;

CREATE TABLE `db_mybatis`.`t_user` (
  `id`          INT         NOT NULL AUTO_INCREMENT
  COMMENT '用户id',
  `username`    VARCHAR(64) NULL
  COMMENT '用户名',
  `password`    VARCHAR(32) NULL
  COMMENT '密码',
  `email`       VARCHAR(64) NULL
  COMMENT '邮箱',
  `info`        TEXT(512)   NULL
  COMMENT '简介',
  `img`         BLOB        NULL
  COMMENT '头像',
  `create_time` DATETIME    NULL
  COMMENT '创建时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `db_mybatis`.`t_role` (
  `id`          INT         NOT NULL AUTO_INCREMENT
  COMMENT '角色id',
  `name`        VARCHAR(64) NULL
  COMMENT '角色名',
  `enabled`     INT         NULL
  COMMENT '有效标识',
  `create_by`   INT         NULL
  COMMENT '创建人',
  `create_time` DATETIME    NULL
  COMMENT '创建时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `db_mybatis`.`t_permission` (
  `id`   INT         NOT NULL AUTO_INCREMENT
  COMMENT '权限id',
  `name` VARCHAR(64) NULL
  COMMENT '权限名称\n',
  `url`  VARCHAR(64) NULL
  COMMENT '权限url',
  PRIMARY KEY (`id`)
);

CREATE TABLE `db_mybatis`.`t_user_role` (
  `user_id` INT NULL
  COMMENT '用户id',
  `role_id` INT NULL
  COMMENT '角色id'
);

CREATE TABLE `db_mybatis`.`t_role_permission` (
  `role_id`       INT         NULL
  COMMENT '角色id\n',
  `permission_id` VARCHAR(45) NULL
  COMMENT '权限id'
);

INSERT INTO `db_mybatis`.`t_user`
VALUES
  (NULL, 'admin', '123456', 'admin@oriki.cn', '管理员', NULL, now());

INSERT INTO `db_mybatis`.`t_user`
VALUES
  (NULL, 'guest', '123456', 'guest@oriki.cn', '访客', NULL, now());

INSERT INTO `db_mybatis`.`t_role`
VALUES
  (NULL, '管理员', 1, 1, now());

INSERT INTO `db_mybatis`.`t_role`
VALUES
  (NULL, '访客', 1, 1, now());

INSERT INTO `db_mybatis`.`t_user_role`
VALUES
  (1, 1);

INSERT INTO `db_mybatis`.`t_user_role`
VALUES (1, 2);

INSERT INTO `db_mybatis`.`t_user_role`
VALUES (2, 2);

INSERT INTO `db_mybatis`.`t_permission`
VALUES (NULL, '用户管理', '/users');

INSERT INTO `db_mybatis`.`t_permission`
VALUES
  (NULL, '角色管理', '/roles');

INSERT INTO `db_mybatis`.`t_permission`
VALUES
  (NULL, '系统日志', '/logs');

INSERT INTO `db_mybatis`.`t_permission`
VALUES
  (NULL, '人员维护', '/persons');

INSERT INTO `db_mybatis`.`t_permission`
VALUES
  (NULL, '单位维护', '/companies');

INSERT INTO `db_mybatis`.`t_role_permission`
VALUES
  (1, 1);

INSERT INTO `db_mybatis`.`t_role_permission`
VALUES
  (1, 2);

INSERT INTO `db_mybatis`.`t_role_permission`
VALUES
  (1, 3);

INSERT INTO `db_mybatis`.`t_role_permission`
VALUES
  (2, 4);

INSERT INTO `db_mybatis`.`t_role_permission`
VALUES
  (2, 5);
