/*
 Navicat MySQL Data Transfer

 Source Server         : tianwen
 Source Server Type    : MySQL
 Source Server Version : 50712
 Source Host           : 192.168.1.7:3306
 Source Schema         : tianwen

 Target Server Type    : MySQL
 Target Server Version : 50712
 File Encoding         : 65001

 Date: 24/05/2021 22:46:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `work_id` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birth_date` datetime(0) NULL DEFAULT NULL,
  `state` int(4) NOT NULL DEFAULT 1 COMMENT '0-离职，1-在职',
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (1, '张三', '100210', '2009-12-16 00:00:00', 1, '2021-04-18 23:03:57');
INSERT INTO `person` VALUES (2, '李四', '100110', '2010-01-02 00:00:00', 1, '2021-04-18 23:05:00');
INSERT INTO `person` VALUES (3, '测试', '101010', '1991-12-31 16:00:00', 1, '2021-05-10 14:09:42');
INSERT INTO `person` VALUES (4, '萧炎', '20000', '1999-12-31 16:00:00', 1, '2021-05-10 14:13:47');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (1, 'test', 'e10adc3949ba59abbe56e057f20f883e', '2021-03-04 00:43:38');

SET FOREIGN_KEY_CHECKS = 1;
