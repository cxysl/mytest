/*
Navicat MySQL Data Transfer

Source Server         : aaa
Source Server Version : 50728
Source Host           : localhost:3306
Source Database       : db_supermarket

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2019-11-25 16:57:09
*/

DROP DATABASE IF EXISTS db_supermarket;
CREATE DATABASE db_supermarket;
USE db_supermarket;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attenceinfo
-- ----------------------------
DROP TABLE IF EXISTS `attenceinfo`;
CREATE TABLE `attenceinfo` (
  `attenceno` varchar(20) NOT NULL,
  `userno` varchar(20) DEFAULT NULL,
  `isonduty` char(1) DEFAULT NULL,
  `ondutydate` varchar(40) DEFAULT NULL,
  `isoffduty` char(1) DEFAULT NULL,
  `offdutydate` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`attenceno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attenceinfo
-- ----------------------------
INSERT INTO `attenceinfo` VALUES ('569', 'e201905062', 'y', ' 2019-11-25 13:11', 'y', ' 2019-11-25 13:11');
INSERT INTO `attenceinfo` VALUES ('775', 'e201905063', 'y', ' 2019-11-25 13:18', 'y', ' 2019-11-25 13:19');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodscode` varchar(60) NOT NULL,
  `barcode` varchar(30) DEFAULT NULL,
  `goodsname` varchar(30) DEFAULT NULL,
  `isonsale` char(1) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `count` int(4) DEFAULT NULL,
  PRIMARY KEY (`goodscode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('s001', 'x001', '卫龙亲嘴烧', 'y', '3', '1000');
INSERT INTO `goods` VALUES ('s002', 'x002', '可乐', 'y', '2', '300');
INSERT INTO `goods` VALUES ('s003', 'x003', '酒鬼花生', 'y', '3.5', '250');

-- ----------------------------
-- Table structure for goodsoperater
-- ----------------------------
DROP TABLE IF EXISTS `goodsoperater`;
CREATE TABLE `goodsoperater` (
  `goodsoperaterid` varchar(30) NOT NULL,
  `userno` varchar(30) DEFAULT NULL,
  `goodscode` varchar(60) DEFAULT NULL,
  `goodsname` varchar(30) DEFAULT NULL,
  `onsaledate` varchar(40) DEFAULT NULL,
  `onsaleprice` double DEFAULT NULL,
  `isonsale` char(1) DEFAULT NULL,
  PRIMARY KEY (`goodsoperaterid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsoperater
-- ----------------------------
INSERT INTO `goodsoperater` VALUES ('001', 'a', '111', '111', '2019-11-22 00:00:00', '111', 'y');
INSERT INTO `goodsoperater` VALUES ('18714', '866', 's001', '卫龙亲嘴烧', ' 2019-11-25  15:55', '3', 'y');
INSERT INTO `goodsoperater` VALUES ('2447', '457', 's002', '可乐', ' 2019-11-25  15:55', '2', 'y');
INSERT INTO `goodsoperater` VALUES ('40867', '871', 's002', '可乐', ' 2019-11-25  13:16', '2', 'n');
INSERT INTO `goodsoperater` VALUES ('4930', '213', 's001', '卫龙亲嘴烧', '2019-11-24 00:00:00', '3', 'y');
INSERT INTO `goodsoperater` VALUES ('86627', '423', 's001', '卫龙亲嘴烧', ' 2019-11-25  13:15', '3', 'n');
INSERT INTO `goodsoperater` VALUES ('93478', '776', 's001', '卫龙亲嘴烧', ' 2019-11-25  13:17', '3', 'y');
INSERT INTO `goodsoperater` VALUES ('95202', '901', 's001', '卫龙亲嘴烧', ' 2019-11-25  13:17', '3', 'n');

-- ----------------------------
-- Table structure for purchase
-- ----------------------------
DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `purchaseid` varchar(20) NOT NULL,
  `goodscode` varchar(60) DEFAULT NULL,
  `goosname` varchar(20) DEFAULT NULL,
  `purchasetime` datetime DEFAULT NULL,
  `purchasecount` int(8) DEFAULT NULL,
  `purchaseprice` double DEFAULT NULL,
  `supplierno` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`purchaseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchase
-- ----------------------------
INSERT INTO `purchase` VALUES ('8101', 's001', '卫龙亲嘴烧', '2019-11-25 14:29:00', '1000', '1.5', 'g001');

-- ----------------------------
-- Table structure for saledetial
-- ----------------------------
DROP TABLE IF EXISTS `saledetial`;
CREATE TABLE `saledetial` (
  `detialid` varchar(20) NOT NULL,
  `userno` varchar(20) DEFAULT NULL,
  `goodscode` varchar(60) DEFAULT NULL,
  `goodsname` varchar(30) DEFAULT NULL,
  `count` int(10) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `sumprice` double DEFAULT NULL,
  `saledate` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`detialid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of saledetial
-- ----------------------------

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `supplierno` varchar(20) NOT NULL,
  `suppliername` varchar(20) DEFAULT NULL,
  `suppliermanager` varchar(15) DEFAULT NULL,
  `suppliercontact` varchar(8) DEFAULT NULL,
  `suppliercontactphone` varchar(20) DEFAULT NULL,
  `supplieraddress` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`supplierno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('g001', '卫龙集团', '程世林', '程世林', '17687876542', '中国，湖北');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userno` varchar(10) NOT NULL,
  `uname` varchar(20) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `account` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `isadmin` char(1) DEFAULT NULL,
  `isenable` char(1) DEFAULT NULL,
  `isonline` char(1) DEFAULT NULL,
  PRIMARY KEY (`userno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('e201905061', '张三', '1123123', 'a', '1', 'y', 'y', 'y');
INSERT INTO `userinfo` VALUES ('e201905062', '李四', '2345234', 'b', '1', 'n', 'y', 'y');
INSERT INTO `userinfo` VALUES ('e201905063', '韩启航', '7.88414', 'c', '1', 'n', 'y', 'y');
