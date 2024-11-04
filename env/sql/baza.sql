CREATE DATABASE vehicle;
USE vehicle;

CREATE TABLE `vehicle_location` (
  `user_id` int NOT NULL,
  `vehicle_id` int DEFAULT NULL,
  `x` double DEFAULT NULL,
  `y` double DEFAULT NULL,
  `vehicle_location_id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`vehicle_location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;