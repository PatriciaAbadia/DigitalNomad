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
-- Schema weather_detail
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `weather_detail` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `weather_detail` ;

-- -----------------------------------------------------
-- Table `weather_detail`.`weather_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `weather_detail`.`weather_detail` (
  `city_season` VARCHAR(255) NOT NULL,
  `city` VARCHAR(255) NULL DEFAULT NULL,
  `season` VARCHAR(255) NULL DEFAULT NULL,
  `feel_weather` VARCHAR(255) NULL DEFAULT NULL,
  `feel_temperature` INT NULL DEFAULT NULL,
  `real_weather` VARCHAR(255) NULL DEFAULT NULL,
  `real_temperature` INT NULL DEFAULT NULL,
  `feel_damp` VARCHAR(255) NULL DEFAULT NULL,
  `humidity` INT NULL DEFAULT NULL,
  `is_rainy` VARCHAR(255) NULL DEFAULT NULL,
  `rain` INT NULL DEFAULT NULL,
  PRIMARY KEY (`city_season`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
