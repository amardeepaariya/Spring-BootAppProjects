drop table if exists topics2;
drop table if exists users3;

create table topics2 (
        topic_id integer not null auto_increment,
        category varchar(100) not null,
        title varchar(100) not null,
        primary key (topic_id)
    );
    
     create table users3 (
        username varchar(50) not null,
        country varchar(30),
        enabled smallint,
        full_name varchar(100),
        password varchar(800) not null,
        role varchar(50),
        primary key (username)
    );
  