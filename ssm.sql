/*
 Navicat Premium Data Transfer

 Source Server         : connect
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 22/07/2020 09:22:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, 'xzx', 123);
INSERT INTO `account` VALUES (2, 'xzx', 123);
INSERT INTO `account` VALUES (3, 'xzxa', 123);
INSERT INTO `account` VALUES (4, 'xzxab', 123);
INSERT INTO `account` VALUES (5, 'xzxabc', 123);
INSERT INTO `account` VALUES (6, 'new one', 255);
INSERT INTO `account` VALUES (7, 'new one', 255);

SET FOREIGN_KEY_CHECKS = 1;
