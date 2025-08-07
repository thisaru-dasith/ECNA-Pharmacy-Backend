create table orders
(
    order_id    binary(16) default (UUID_TO_BIN(uuid())) not null
                primary key,
    created_at  datetime   default current_timestamp     not null,
    total_price decimal(10, 2)                           not null
);


create table order_items
(
    id          bigint         not null
        primary key,
    drug_id     BIGINT         not null,
    order_id    binary(16)     not null,
    unit_price  decimal(10, 2) not null,
    quantity    int            not null,
    total_price decimal(10, 2) not null,
    constraint order_items__drug_id_fk
        foreign key (drug_id) references drugs(drug_id),
    constraint  order_items__order_id_fk
        foreign key (order_id) references orders(order_id)
);

