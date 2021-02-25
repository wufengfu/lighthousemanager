
-- 用户
create table my_user
(
    id int not null primary key auto_increment,
    create_time date not null,
    update_time date not null,
    name varchar(16) not null comment '用户名',
    pass varchar(64) not null comment '密码',
    card_no varchar(32) comment '实体卡号',
    del_flag tinyint not null default 0 comment '删除标记'
)DEFAULT CHARSET=utf8;

-- my_user表创建账户唯一索引
alter table my_user add unique index uni_name(name);

-- 创建major_large 大类视图
create view major_large
    as
    select largeclass_name, group_concat(major_code,'|', parent_name) as parent_info
    from major group by largeclass_name;

-- 创建major_parent视图
create view major_parent
    as
    select parent_name, undergraduate, group_concat(major_code,'|',major_name) as major_info
    from major group by parent_name, undergraduate;



