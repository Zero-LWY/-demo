/*
 Navicat Premium Data Transfer

 Source Server         : loacllhost
 Source Server Type    : MySQL
 Source Server Version : 50522
 Source Host           : localhost:3306
 Source Schema         : uxb

 Target Server Type    : MySQL
 Target Server Version : 50522
 File Encoding         : 65001

 Date: 29/04/2019 15:58:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for u_department
-- ----------------------------
DROP TABLE IF EXISTS `u_department`;
CREATE TABLE `u_department`  (
  `dept_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称或下属机构名称',
  `parent_id` int(20) UNSIGNED NOT NULL COMMENT '父级主键id',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for u_user
-- ----------------------------
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user`  (
  `user_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职员姓名',
  `dept_id` int(11) UNSIGNED NULL DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`user_id`) USING BTREE,
  INDEX `fk_user_dept`(`dept_id`) USING BTREE,
  CONSTRAINT `fk_user_dept` FOREIGN KEY (`dept_id`) REFERENCES `u_department` (`dept_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
