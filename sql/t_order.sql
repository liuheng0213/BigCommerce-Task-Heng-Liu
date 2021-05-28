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

 Date: 28/05/2021 20:36:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `total_inc_tax` decimal(6, 2) NOT NULL,
  `date_created` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `customer_id` int(4) NOT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status_id` int(4) NOT NULL,
  `cart_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `customer_locale` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `is_deleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES (1, 354.22, '2020 12:20:13', 1, 'completed', 10, '4567X', 'AU', 0);
INSERT INTO `t_order` VALUES (2, 176.22, '2020 12:20:13', 1, 'shipped', 2, '456D7X', 'AU', 0);
INSERT INTO `t_order` VALUES (3, 76.84, '2019 22:20:13', 2, 'completed', 10, '4567DX', 'AU', 0);
INSERT INTO `t_order` VALUES (4, 7260.00, '2020 12:20:13', 2, 'completed', 10, '45CX67X', 'EN', 0);
INSERT INTO `t_order` VALUES (5, 76.00, '2019 13:20:13', 2, 'completed', 10, '4567X', 'EN', 0);
INSERT INTO `t_order` VALUES (6, 7.00, '2019 14:20:13', 3, 'completed', 10, '456X7X', 'CN', 0);
INSERT INTO `t_order` VALUES (7, 78.00, '2020 12:20:13', 4, 'completed', 10, '456X7X', 'CN', 0);
INSERT INTO `t_order` VALUES (8, 60.00, '2020 12:20:13', 4, 'Awaiting Payment', 7, '4X567X', 'US', 0);
INSERT INTO `t_order` VALUES (9, 65.56, '2019 22:20:13', 2, 'completed', 10, '456X7X', 'AU', 0);
INSERT INTO `t_order` VALUES (10, 650.49, '2020 12:20:13', 2, 'completed', 10, '45XD67X', 'AU', 0);
INSERT INTO `t_order` VALUES (11, 20.00, '2019 13:20:13', 2, 'completed', 10, '456DD7X', 'AU', 0);
INSERT INTO `t_order` VALUES (12, 15.00, '2019 14:20:13', 3, 'Awaiting Payment', 7, '4567X', 'EN', 0);
INSERT INTO `t_order` VALUES (13, 190.00, '2020 12:20:13', 1, 'completed', 10, '45X67X', 'AU', 0);
INSERT INTO `t_order` VALUES (14, 78.35, '2020 12:20:13', 1, 'completed', 10, '456WW7X', 'EN', 0);
INSERT INTO `t_order` VALUES (15, 320.78, '2019 22:20:13', 2, 'Awaiting Payment', 7, '4567X', 'EN', 0);
INSERT INTO `t_order` VALUES (16, 24.00, '2020 12:20:13', 2, 'completed', 10, '456TTT7X', 'AU', 0);
INSERT INTO `t_order` VALUES (17, 64.00, '2019 13:20:13', 2, 'completed', 10, '456DD7X', 'EN', 0);
INSERT INTO `t_order` VALUES (18, 56.00, '2019 14:20:13', 6, 'completed', 10, '4567X', 'AU', 0);
INSERT INTO `t_order` VALUES (19, 90.00, '2020 12:20:13', 1, 'Awaiting Payment', 7, '45SSS67X', 'EN', 0);
INSERT INTO `t_order` VALUES (20, 81.00, '2020 12:20:13', 1, 'completed', 10, '456DD7X', 'AU', 0);
INSERT INTO `t_order` VALUES (21, 72.00, '2019 22:20:13', 5, 'completed', 10, '4567CCX', 'EN', 0);
INSERT INTO `t_order` VALUES (22, 88.77, '2020 12:20:13', 2, 'completed', 10, '4XXX567X', 'AU', 0);
INSERT INTO `t_order` VALUES (23, 45.00, '2019 13:20:13', 2, 'completed', 10, '45CCC67X', 'EN', 0);
INSERT INTO `t_order` VALUES (24, 90.00, '2019 14:20:13', 3, 'completed', 10, '456WWW7X', 'EN', 0);

SET FOREIGN_KEY_CHECKS = 1;
