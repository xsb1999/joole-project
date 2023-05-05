/*
Navicat MySQL Data Transfer

Source Server         : connection1
Source Server Version : 80019
Source Host           : localhost:3306
Source Database       : joole

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2023-05-05 00:54:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for description
-- ----------------------------
DROP TABLE IF EXISTS `description`;
CREATE TABLE `description` (
  `description_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL,
  `manufacturer` varchar(100) DEFAULT NULL,
  `series` varchar(100) DEFAULT NULL,
  `model` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`description_id`),
  KEY `description_product_product_id_fk` (`product_id`),
  CONSTRAINT `description_product_product_id_fk` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of description
-- ----------------------------

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `product_type_id` int DEFAULT NULL,
  `technical_detail_id` int DEFAULT NULL,
  `description_id` int DEFAULT NULL,
  `product_brand` varchar(500) DEFAULT NULL,
  `certification` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `product_description_description_id_fk` (`description_id`),
  KEY `product_product_type_product_type_id_fk` (`product_type_id`),
  KEY `product_technical_detail_technical_detail_id_fk` (`technical_detail_id`),
  CONSTRAINT `product_description_description_id_fk` FOREIGN KEY (`description_id`) REFERENCES `description` (`description_id`),
  CONSTRAINT `product_product_type_product_type_id_fk` FOREIGN KEY (`product_type_id`) REFERENCES `product_type` (`product_type_id`),
  CONSTRAINT `product_technical_detail_technical_detail_id_fk` FOREIGN KEY (`technical_detail_id`) REFERENCES `technical_detail` (`technical_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for product_type
-- ----------------------------
DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type` (
  `product_type_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL,
  `application` varchar(100) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `mounting_location` varchar(100) DEFAULT NULL,
  `accessories` varchar(100) DEFAULT NULL,
  `model_year` date DEFAULT NULL,
  PRIMARY KEY (`product_type_id`),
  KEY `product_type_product_product_id_fk` (`product_id`),
  CONSTRAINT `product_type_product_product_id_fk` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_type
-- ----------------------------

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `project_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`project_id`),
  KEY `project_user_user_name_fk` (`user_name`),
  CONSTRAINT `project_user_user_name_fk` FOREIGN KEY (`user_name`) REFERENCES `user` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------

-- ----------------------------
-- Table structure for project_product
-- ----------------------------
DROP TABLE IF EXISTS `project_product`;
CREATE TABLE `project_product` (
  `project_product_id` int NOT NULL AUTO_INCREMENT,
  `project_id` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  PRIMARY KEY (`project_product_id`),
  KEY `project_product_product_product_id_fk` (`product_id`),
  KEY `project_product_project_project_id_fk` (`project_id`),
  CONSTRAINT `project_product_product_product_id_fk` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `project_product_project_project_id_fk` FOREIGN KEY (`project_id`) REFERENCES `project` (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_product
-- ----------------------------

-- ----------------------------
-- Table structure for technical_detail
-- ----------------------------
DROP TABLE IF EXISTS `technical_detail`;
CREATE TABLE `technical_detail` (
  `technical_detail_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL,
  `airflow` int DEFAULT NULL,
  `power` int DEFAULT NULL,
  `operating_voltage` int DEFAULT NULL,
  `fan_speed` int DEFAULT NULL,
  PRIMARY KEY (`technical_detail_id`),
  KEY `technical_detail_product_product_id_fk` (`product_id`),
  CONSTRAINT `technical_detail_product_product_id_fk` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of technical_detail
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_name` varchar(100) NOT NULL,
  `user_type` varchar(50) DEFAULT NULL,
  `user_password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
