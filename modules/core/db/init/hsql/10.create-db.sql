-- begin NEWS_NEWS
create table NEWS_NEWS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TEXT_OF_NEWS longvarchar,
    STATUS integer,
    NEWS_CAPTION varchar(100) not null,
    --
    primary key (ID)
)^
-- end NEWS_NEWS
