CREATE TYPE my_custom_type AS (
    name VARCHAR(255),
    count BIGINT
);

CREATE TABLE my_table (
    table_id BIGSERIAL PRIMARY KEY,
    single_count my_custom_type NULL,
    count_array my_custom_type[]
);
