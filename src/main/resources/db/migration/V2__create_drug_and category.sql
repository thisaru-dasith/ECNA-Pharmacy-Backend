create table drug_categories
(
    id   int auto_increment
        primary key,
    name VARCHAR(255) not null
);

create table drugs
(
    drug_id     BIGINT auto_increment
        primary key,
    name        VARCHAR(255) not null,
    category_id int          not null,
    constraint drugs__id_fk
        foreign key (category_id) references drug_categories(id)
);
