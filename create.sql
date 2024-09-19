create table user(
  id int unsigned primary key auto_increment COMMENT 'ID',
  name varchar(100) comment '姓名',
  gender tinyint unsigned comment '性别，1：男，2：女',
  age tinyint unsigned comment '年龄'
  ) comment '用户表';

insert into user(id,name,gender,age) values (null,'许昊龙','1',23);
insert into user(id,name,gender,age) values (null,'哈基米','2',5);
insert into user(id,name,gender,age) values (null,'千早爱音','2',18);


