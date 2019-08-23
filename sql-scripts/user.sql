/*
 Navicat Premium Data Transfer

 Source Server         : mac_for_mysql
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost
 Source Database       : world

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : utf-8

 Date: 08/22/2019 18:49:14 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '姓名',
  `age` int(20) DEFAULT NULL COMMENT '年龄',
  `address` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '地址',
  `time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '显示时间',
  `phone` bigint(20) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('24', 'tanglangji2', '23', 'huamao2', '2019-08-22 16:38:53', '111'), ('25', 'tanglangji3', '24', 'huamao3', '2019-08-22 16:38:55', '111'), ('26', 'tanglangji4', '25', 'huamao4', '2019-08-22 16:38:57', '111');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
