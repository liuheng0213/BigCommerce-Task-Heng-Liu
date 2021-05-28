/*
 Navicat Premium Data Transfer

 Source Server         : stephen's mysql
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : bigcommerce

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 28/05/2021 20:36:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `date_created` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date_modified` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `company` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `first_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `last_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES (1, '2019 12:20:13', '2020 12:20:13', 'bigcommerce', 'heng', 'liu', 'xx@qq', '1234');
INSERT INTO `t_customer` VALUES (2, '2019 12:20:13', '2020 12:20:13', 'bigcommerce1', 'stephen', 'xx@qq', 'liu', '12344');
INSERT INTO `t_customer` VALUES (3, '2019 12:20:13', '2019 22:20:13', 'bigcommerce', 'zhu', 'liu', 'xx@qq', '123411');
INSERT INTO `t_customer` VALUES (4, '2019 12:20:13', '2020 12:20:13', 'bigcommerce1', 'viki', 'liu', 'xx@qq', '123422');
INSERT INTO `t_customer` VALUES (5, '2019 12:20:13', '2019 13:20:13', 'bigcommerce', 'heng', 'liu', 'xx@qq', '123455');
INSERT INTO `t_customer` VALUES (6, '2019 12:20:13', '2019 14:20:13', 'bigcommerce', 'heng', 'liu4', 'xx@qq', '1234666');
INSERT INTO `t_customer` VALUES (7, '2019 12:20:13', '2020 12:20:13', 'bigcommerce', 'heng', 'liu2', 'xx@qq', '123433');
INSERT INTO `t_customer` VALUES (8, '2019 12:20:13', '2020 12:20:13', 'bigcommerce', 'heng', 'liu3', 'xx@qq', '1234');

SET FOREIGN_KEY_CHECKS = 1;
