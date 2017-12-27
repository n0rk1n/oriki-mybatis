USE db_mybatis;
CREATE TABLE t_user (
  id   INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  name VARCHAR(32)
);

INSERT INTO t_user VALUES (NULL, 'zhangsan');