SELECT user, host FROM mysql.user;
DROP USER 'ironhacker'@'localhost';
CREATE USER 'ironhacker'@'localhost' IDENTIFIED BY 'Ir0nh4ck3r!';
GRANT ALL PRIVILEGES ON midProject.* TO 'ironhacker'@'localhost';
GRANT ALL PRIVILEGES ON midProject_test.* TO 'ironhacker'@'localhost';

-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema weather_detail
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema city_detail
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema city_detail
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `city_detail` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `city_detail` ;

-- -----------------------------------------------------
-- Table `city_detail`.`city_info`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `city_detail`.`city_info` (
  `city` VARCHAR(255) NOT NULL,
  `country` VARCHAR(255) NULL DEFAULT NULL,
  `continent` VARCHAR(255) NULL DEFAULT NULL,
  `total_score` DECIMAL(5,2) NULL DEFAULT NULL,
  `cost_of_life` DECIMAL(10,0) NULL DEFAULT NULL,
  `remote_workers` INT NULL DEFAULT NULL,
  `internet` VARCHAR(255) NULL DEFAULT NULL,
  `fun` VARCHAR(255) NULL DEFAULT NULL,
  `nightlife` VARCHAR(255) NULL DEFAULT NULL,
  `safety` VARCHAR(255) NULL DEFAULT NULL,
  `lack_of_crime` VARCHAR(255) NULL DEFAULT NULL,
  `walkability` VARCHAR(255) NULL DEFAULT NULL,
  `racism` VARCHAR(255) NULL DEFAULT NULL,
  `foreigners_friendly` VARCHAR(255) NULL DEFAULT NULL,
  `freedom_of_speech` VARCHAR(255) NULL DEFAULT NULL,
  `female_friendly` VARCHAR(255) NULL DEFAULT NULL,
  `LGBTQ_friendly` VARCHAR(255) NULL DEFAULT NULL,
  `english_speaking` VARCHAR(255) NULL DEFAULT NULL,
  `latitude` DECIMAL(10,7) NULL DEFAULT NULL,
  `longitude` DECIMAL(10,7) NULL DEFAULT NULL,
  `near_beach` VARCHAR(255) NULL DEFAULT NULL,
  `photo` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`city`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
