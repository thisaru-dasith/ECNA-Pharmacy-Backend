ALTER TABLE purchases
    DROP FOREIGN KEY purchase__drug_id_fk;

ALTER TABLE purchases
    DROP COLUMN drug_id,
    DROP COLUMN quantity,
    DROP COLUMN unit_price,
    DROP COLUMN expire_date;

CREATE TABLE purchase_items(
    item_id binary(16) default (uuid_to_bin(uuid())) not null
        primary key,
    quantity int not null,
    unit_price decimal(10,2) not null,
    total_price decimal(10,2) not null,
    expire_date DATE not null,
    drug_id bigint not null,
    purchase_id binary(16) not null,
    constraint  purchase_items_drug_id_fk
                           foreign key (drug_id) references drugs(drug_id),
    constraint purchase_items_purchase_if_fk
                           foreign key (purchase_id) references purchases(id)

)