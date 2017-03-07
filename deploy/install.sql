-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.14 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para dado_eq3
DROP DATABASE IF EXISTS `dado_eq3`;
CREATE DATABASE IF NOT EXISTS `dado_eq3` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dado_eq3`;

-- Volcando estructura para tabla dado_eq3.tirada
DROP TABLE IF EXISTS `tirada`;
CREATE TABLE IF NOT EXISTS `tirada` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_tiradas_usuarios_idx` (`usuario_id`),
  CONSTRAINT `fk_tiradas_usuarios` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dado_eq3.tirada: ~0 rows (aproximadamente)
DELETE FROM `tirada`;
/*!40000 ALTER TABLE `tirada` DISABLE KEYS */;
/*!40000 ALTER TABLE `tirada` ENABLE KEYS */;

-- Volcando estructura para tabla dado_eq3.usuario
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `fecha_alta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_baja` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dado_eq3.usuario: ~13 rows (aproximadamente)
DELETE FROM `usuario`;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id`, `nombre`, `fecha_alta`, `fecha_modificacion`, `fecha_baja`) VALUES
	(9, 'Guillermo', '2017-03-03 10:51:29', '2017-03-06 13:18:48', NULL),
	(10, 'Ivan', '2017-03-03 10:51:39', '2017-03-06 13:20:52', NULL),
	(11, 'Josu', '2017-03-03 10:55:08', '2017-03-06 13:21:04', NULL),
	(12, 'Ignacio', '2017-03-03 10:55:18', '2017-03-06 13:21:07', NULL),
	(13, 'Aaron', '2017-03-03 11:55:32', '2017-03-06 13:21:10', NULL),
	(16, 'Itsaso', '2017-03-03 12:51:43', '2017-03-06 13:21:14', NULL),
	(17, 'Eneko', '2017-03-03 12:51:52', '2017-03-06 13:21:22', NULL),
	(18, 'Gomez', '2017-03-03 12:52:01', '2017-03-06 13:21:26', NULL),
	(19, 'Nagore', '2017-03-03 12:52:08', '2017-03-06 13:21:32', NULL),
	(20, 'Garbiñe', '2017-03-03 12:52:15', '2017-03-06 13:21:35', NULL),
	(21, 'Egoitz', '2017-03-03 12:52:25', '2017-03-06 13:21:38', NULL),
	(22, 'Perez', '2017-03-03 12:52:33', '2017-03-06 13:21:41', NULL),
	(25, 'Pavel', '2017-03-06 10:51:05', '2017-03-06 13:21:44', NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
