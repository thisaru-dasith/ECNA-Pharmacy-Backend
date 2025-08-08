create table inventories
(
    inventory_id       bigint auto_increment not null
        PRIMARY KEY ,
    remaining_quantity int      not null,
    expire_date        DATETIME not null,
    drug_id            bigint   not null,
    constraint inventory__drug_id_fk
        foreign key (drug_id) references  drugs(drug_id)
);


create table inventory_transactions
(
    id bigint auto_increment not null PRIMARY KEY,
    transaction_type VARCHAR(10) not null,
    quantity int not null,
    source VARCHAR(255) not null,
    transaction_date DATETIME default current_timestamp not null,
    drug_id bigint not null,
    constraint inventory_transaction__drug_id_fk
        foreign key (drug_id) references drugs(drug_id)

)
