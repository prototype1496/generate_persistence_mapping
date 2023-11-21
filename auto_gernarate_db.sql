-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.28-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for auto_gernarate_db
DROP DATABASE IF EXISTS `auto_gernarate_db`;
CREATE DATABASE IF NOT EXISTS `auto_gernarate_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `auto_gernarate_db`;

-- Dumping structure for table auto_gernarate_db.address
DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `primaryAddress` text NOT NULL,
  `secondaryAddress` text DEFAULT NULL,
  `streetNo` varchar(50) DEFAULT NULL,
  `zipCode` varchar(50) DEFAULT '10010',
  `districtId` int(11) NOT NULL,
  `identificationId` varchar(50) DEFAULT NULL,
  `dateCreated` datetime NOT NULL DEFAULT current_timestamp(),
  `dateModified` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `createdBy` bigint(20) NOT NULL DEFAULT 0,
  `modifiedBy` bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table auto_gernarate_db.address: ~12 rows (approximately)
REPLACE INTO `address` (`id`, `primaryAddress`, `secondaryAddress`, `streetNo`, `zipCode`, `districtId`, `identificationId`, `dateCreated`, `dateModified`, `createdBy`, `modifiedBy`) VALUES
	(20, '123 Main St', 'Apt 45', '5', '10001', 1, '45', '2023-11-19 23:55:03', '2023-11-19 23:55:03', 1, 1),
	(21, '123 Main St', 'Apt 45', '5', '10001', 1, '46', '2023-11-20 01:30:05', '2023-11-20 01:30:05', 1, 1),
	(22, '123 Main St', 'Apt 45', '5', '10001', 1, '47', '2023-11-20 01:33:04', '2023-11-20 01:33:04', 1, 1),
	(23, '123 Main St', 'Apt 45', '5', '10001', 1, '48', '2023-11-20 01:34:13', '2023-11-20 01:34:13', 1, 1),
	(28, '123 Main St', 'Apt 45', '5', '10001', 1, '53', '2023-11-20 02:06:59', '2023-11-20 02:06:59', 1, 1),
	(29, '123 Main St', 'Apt 45', '5', '10001', 1, '54', '2023-11-20 02:08:52', '2023-11-20 02:08:52', 1, 1),
	(30, '123 Main St', 'Apt 45', '5', '10001', 1, '55', '2023-11-20 02:12:15', '2023-11-20 02:12:15', 1, 1),
	(31, '123 Main St', 'Apt 45', '5', '10001', 1, '57', '2023-11-20 02:40:19', '2023-11-20 02:40:19', 1, 1),
	(32, '123 Main St', 'Apt 45', '5', '10001', 1, '58', '2023-11-20 08:17:57', '2023-11-20 08:17:57', 1, 1),
	(33, '123 Main St', 'Apt 45', '5', '10001', 1, '59', '2023-11-20 08:19:24', '2023-11-20 08:19:24', 1, 1),
	(34, '123 Main St', 'Apt 45', '5', '10001', 1, '60', '2023-11-20 08:22:14', '2023-11-20 08:22:14', 1, 1),
	(35, '123 Main St', 'Apt 45', '5', '10001', 1, '62', '2023-11-20 08:29:56', '2023-11-20 08:29:56', 1, 1);

-- Dumping structure for table auto_gernarate_db.users
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `idString` varchar(50) NOT NULL,
  `userType` varchar(20) NOT NULL,
  `titleId` int(11) NOT NULL,
  `profilePictureId` int(11) DEFAULT NULL,
  `gender` varchar(50) NOT NULL,
  `lastLoginIp` varchar(100) DEFAULT NULL,
  `firstName` text NOT NULL,
  `lastName` text NOT NULL,
  `otherName` text DEFAULT NULL,
  `dateOfBirth` date NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `emailAddress` varchar(100) DEFAULT NULL,
  `passwordRegex` varchar(100) NOT NULL,
  `numberOfFailedLoginAttempts` int(11) DEFAULT 0,
  `firstLogin` datetime DEFAULT NULL,
  `lastLogin` datetime DEFAULT NULL,
  `contactNo` varchar(50) NOT NULL,
  `resetCode` varchar(10) DEFAULT NULL,
  `resetCodeExpiry` timestamp NULL DEFAULT NULL,
  `status` varchar(50) NOT NULL,
  `active` tinyint(4) NOT NULL DEFAULT 0,
  `createdBy` bigint(20) NOT NULL,
  `modifiedBy` bigint(20) NOT NULL,
  `dateCreated` datetime NOT NULL,
  `dateModified` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `idString` (`idString`),
  KEY `titleId` (`titleId`),
  KEY `userType` (`userType`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table auto_gernarate_db.users: ~4 rows (approximately)
REPLACE INTO `users` (`id`, `idString`, `userType`, `titleId`, `profilePictureId`, `gender`, `lastLoginIp`, `firstName`, `lastName`, `otherName`, `dateOfBirth`, `username`, `password`, `emailAddress`, `passwordRegex`, `numberOfFailedLoginAttempts`, `firstLogin`, `lastLogin`, `contactNo`, `resetCode`, `resetCodeExpiry`, `status`, `active`, `createdBy`, `modifiedBy`, `dateCreated`, `dateModified`) VALUES
	(1, '1', 'ADMIN', 1, NULL, 'MALE', NULL, 'Alinuswe', 'Mwandobo', '', '1996-11-18', 'a', 'rqAwa4LV1B7vOEEPjrA4BsOU5CAEQmSQiQ7v3ndtsUM=', 'a', 'rqAwa4LV1B7vOEEPjrA4BsOU5CAEQmSQiQ7v3ndtsUM=', 0, '2023-11-18 15:08:53', NULL, '0973609319', NULL, NULL, 'ACTIVE', 1, 1, 1, '2023-11-18 15:09:16', '2023-11-20 00:09:05'),
	(3, '2', 'ADMIN', 1, 1, 'MALE', NULL, 'John', 'Doe', 'Middle', '1990-01-01', 'john.doe', 'RdTLZJrcnt+cXubddnFxUSRF8ALkv9YMBB3iyoXo3wg=', 'b', 'gZ2X4i7vNrwveZcNBf3qVmaDHvCSLpyUrMtTfJwb1zU=', 0, NULL, NULL, '+260973609319', NULL, NULL, 'CREATED', 1, 1, 1, '2023-11-19 14:18:44', '2023-11-20 00:09:07'),
	(15, '3', 'ADMIN', 1, 1, 'MALE', NULL, 'John', 'Doe', NULL, '1990-01-01', 'c', 'onGmBdKoWumwVmbkEjR1gvmQyXpQ9g3W2LJc3fuUs98=', 'c', '6FhkgDyf7oi/iLZ9xGh74QoD8hl36r68Z3/zcoO+jqY=', 0, NULL, NULL, '+260973609319', NULL, NULL, 'CREATED', 1, 1, 1, '2023-11-19 14:38:30', '2023-11-20 00:09:08'),
	(62, '365224259728615', 'ADMIN', 1, 1, 'MALE', NULL, 'John', 'Doe', NULL, '1990-01-01', 'bbbbbb', 'uTk+/iEdWabJPBRCyQAJRfBnGeJd0ec6gRaEzbV6N+D9bg==', NULL, 'RkGzodYBadzZCt4CV5cXeGr/hR62zNZOvUgMOw164MFJ2A==', 0, NULL, NULL, '+260973609319', NULL, NULL, 'CREATED', 1, 1, 1, '2023-11-20 08:29:56', '2023-11-20 08:29:56');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
