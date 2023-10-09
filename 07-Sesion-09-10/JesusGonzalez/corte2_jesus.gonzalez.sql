-- Si nos dan la base de datos, no se debe crear, solo se usa
-- create database corte2_jesus.gonzalez;
use corte2_jesus.gonzalez;

CREATE TABLE IF NOT EXISTS `corte2_jesus.gonzalez`.`estudiante` (
  `edad` INT(11) NULL DEFAULT NULL,
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `apellido` VARCHAR(50) NULL DEFAULT NULL,
  `nombre` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `u342060465_distribuidos`.`materia_estudiante` (
  `estudiante_id` BIGINT(20) NOT NULL,
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `materia` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),  
  CONSTRAINT `FKra4ggywbt20o70mac1bsxml4c`
    FOREIGN KEY (`estudiante_id`)
    REFERENCES `u342060465_distribuidos`.`estudiante` (`id`)
)
