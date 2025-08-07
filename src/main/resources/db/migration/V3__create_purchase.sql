create table purchases
(
    id            binary(16) default (uuid_to_bin(uuid())) not null
        primary key,
    drug_id       BIGINT                             not null,
    quantity      int                                not null,
    unit_price    decimal(10, 2)                     not null,
    total_price   decimal(10, 2)                     not null,
    purchase_date datetime default current_timestamp not null,
    expire_date datetime not null,
    constraint purchase__drug_id_fk
        foreign key (drug_id) references drugs(drug_id)
);


