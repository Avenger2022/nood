-- auto-generated definition
create table user
(
    id           int          not null
        primary key,
    username     varchar(255) not null,
    password     varchar(255) not null,
    sex          varchar(255) null,
    email        varchar(255) null,
    iphone       varchar(255) null,
    name         varchar(255) null,
    age          int          null,
    address      varchar(255) null,
    relationship varchar(255) null
);