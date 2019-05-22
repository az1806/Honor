-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: honor
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chanpin`
--

DROP TABLE IF EXISTS `chanpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chanpin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` varchar(45) DEFAULT NULL COMMENT '图片地址',
  `Name` varchar(45) DEFAULT NULL COMMENT '名称',
  `JiaGe` int(11) DEFAULT NULL COMMENT '价格',
  `JieShao` varchar(200) DEFAULT NULL COMMENT '介绍',
  `CPU` varchar(20) DEFAULT NULL,
  `DianChi` varchar(20) DEFAULT NULL COMMENT '电池',
  `NeiCun` varchar(20) DEFAULT NULL COMMENT '内存容量',
  `YuanXingNeiCun` varchar(20) DEFAULT NULL COMMENT '运行内存',
  `LeiBie` varchar(20) DEFAULT NULL COMMENT '类别',
  PRIMARY KEY (`id`),
  KEY `LeiBie` (`LeiBie`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='产品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chanpin`
--

LOCK TABLES `chanpin` WRITE;
/*!40000 ALTER TABLE `chanpin` DISABLE KEYS */;
INSERT INTO `chanpin` VALUES (1,'imgges/20i','荣耀20i',1599,'3200万AI自拍 更美更自然','麒麟710F','3400mAh','64GB','6GB','1'),(2,'images/v20.jpg','荣耀V20',100,'科技标杆 见所未见','麒麟710F','3400mAh','64GB','6GB','1'),(3,NULL,'荣耀畅玩8A',100,'珍珠全面屏 震撼大音量','麒麟710F','3400mAh','64GB','6GB','1'),(4,'images/10','荣耀10青春版',100,'幻彩渐变 2400万AI自拍','麒麟710F','3400mAh','64GB','6GB','1'),(5,'images/magic2','荣耀Magic2',100,'滑出魔法世界','麒麟710F','3400mAh','64GB','6GB','1'),(6,'images/8c','荣耀畅玩8C',100,'两天一充 大内存','麒麟710F','3400mAh','64GB','6GB','1'),(7,NULL,'荣耀8X',100,'千元屏霸','麒麟710F','3400mAh','64GB','6GB','1'),(8,NULL,'荣耀8X Max',100,'千元大屏 随身影院','麒麟710F','3400mAh','64GB','6GB','1'),(9,NULL,'荣耀Note10',100,'更大 更快 更COOL','麒麟710F','3400mAh','64GB','6GB','1'),(10,NULL,'荣耀Play',100,'突破 让快更快','麒麟710F','3400mAh','64GB','6GB','1'),(11,NULL,'荣耀magicbook 2019-锐龙版',4699,'性能新升级 超薄长续航','AMD锐龙7 3700U移动处理器','57.4Wh/7565mAh@7.6V（','256GB','8GB','2'),(12,NULL,'荣耀magicbook-锐龙版',4699,'高性能金属轻薄本','AMD锐龙5 2500U移动处理器','57.4Wh/7565mAh@7.6V','256GB','8GB','2'),(13,NULL,'荣耀MagicBook',4699,'独显轻薄','i5-8250U','57.4Wh','256GB','8GB','2'),(14,NULL,'荣耀Waterplay',1999,'防水影音平板','Kirin 659','6660mAh','32GB','3GB','2'),(15,NULL,'荣耀畅玩平板2',899,'持久畅快 更痛快','骁龙425','4800mAh','16GB','2GB','2'),(16,NULL,'荣耀平板2',1499,'好玩不贵','MSM8939','4800mAh','16GB','3GB','2'),(17,NULL,'荣耀平板5',1699,'好玩不贵','Kirin 659','5100mAh','64GB','4GB','2'),(18,NULL,'荣耀FlyPods青春版 真无线耳机',399,'入耳式 真无线',NULL,NULL,NULL,NULL,'3'),(19,NULL,'荣耀畅玩手环A2',129,'智能大屏 随心而动',NULL,'95mAh',NULL,NULL,'3'),(20,NULL,'荣耀手表S1',599,'看到改变',NULL,NULL,NULL,NULL,'3'),(21,NULL,'荣耀YOYO智能音箱',199,'就AI听你说',NULL,NULL,NULL,NULL,'4'),(22,NULL,'荣耀小哨兵智能摄像机',199,'荣耀小哨兵智能摄像机',NULL,NULL,NULL,NULL,'4'),(23,NULL,'荣耀路由Pro 2',329,'四核全千兆 凌霄双芯片',NULL,NULL,NULL,NULL,'4'),(24,NULL,'荣耀分布式路由',799,'开启大覆盖时代',NULL,NULL,NULL,NULL,'4'),(25,NULL,'荣耀移动电源',129,'双向快充，安全可靠',NULL,'10000mAh ',NULL,NULL,'5'),(26,NULL,'荣耀自拍杆',45,'发现更美的自己',NULL,NULL,NULL,NULL,'5'),(27,NULL,'荣耀小口哨',199,'随时听你的',NULL,NULL,NULL,NULL,'5'),(28,NULL,'荣耀引擎耳机2',89,'一副耳机，两种音乐态度',NULL,NULL,NULL,NULL,'5');
/*!40000 ALTER TABLE `chanpin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-23  0:14:30
