## SQL Script

-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema spring
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema spring
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `spring` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `spring` ;

-- -----------------------------------------------------
-- Table `spring`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spring`.`persona` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `identificacion` VARCHAR(30) NOT NULL,
  `nombre` VARCHAR(255) NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `identificacion_UNIQUE` (`identificacion` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 6456484
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spring`.`direccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spring`.`direccion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `persona_id` INT NOT NULL,
  `otrasSenas` VARCHAR(255) NULL DEFAULT NULL,
  `codigo_postal` VARCHAR(255) NULL DEFAULT NULL,
  `otras_senas` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `persona_id_UNIQUE` (`persona_id` ASC) VISIBLE,
  CONSTRAINT `FK9qvdramq61dq0mp2xfh0hvqh`
    FOREIGN KEY (`persona_id`)
    REFERENCES `spring`.`persona` (`id`),
  CONSTRAINT `fk_direccion_persona`
    FOREIGN KEY (`persona_id`)
    REFERENCES `spring`.`persona` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 67
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spring`.`hibernate_sequence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spring`.`hibernate_sequence` (
  `next_val` BIGINT NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `spring`.`telefono`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spring`.`telefono` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `persona_id` INT NOT NULL,
  `numero` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK9jq9vc0d4ktqqc5shm00h5uwm` (`persona_id` ASC) VISIBLE,
  CONSTRAINT `FK9jq9vc0d4ktqqc5shm00h5uwm`
    FOREIGN KEY (`persona_id`)
    REFERENCES `spring`.`persona` (`id`),
  CONSTRAINT `fk_telefono_persona`
    FOREIGN KEY (`persona_id`)
    REFERENCES `spring`.`persona` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 68
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
