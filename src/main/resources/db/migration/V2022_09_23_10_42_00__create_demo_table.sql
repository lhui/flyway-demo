CREATE TABLE `demo`
(
    `id`           bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `description`  varchar(200),
    `created_time` datetime          DEFAULT CURRENT_TIMESTAMP,
    `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
);
