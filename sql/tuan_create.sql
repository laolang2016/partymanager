/**
* 创建团员表
*/

create table tuan(
       student_id varchar(10) primary key,		-- 学号
       application_time date not null,			-- 申请时间
       approval_time date,				-- 批准时间
       quit_time date,					-- 退出时间
       group_id varchar(10),				-- 所属团组织
       foreign key(group_id) references tuanzz(group_id)
)engine=innodb;
