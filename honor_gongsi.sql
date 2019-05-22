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
-- Table structure for table `gongsi`
--

DROP TABLE IF EXISTS `gongsi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongsi` (
  `name` varchar(20) NOT NULL COMMENT '公司名称',
  `DiZhi` varchar(45) DEFAULT NULL COMMENT '公司地址',
  `Phone` int(20) DEFAULT NULL COMMENT '联系方式',
  `Email` varchar(45) DEFAULT NULL COMMENT '邮箱',
  `JeShao` varchar(800) DEFAULT NULL COMMENT '公司介绍',
  `WenHua` varchar(800) DEFAULT NULL COMMENT '公司文化',
  `ReXian` varchar(20) DEFAULT NULL COMMENT '招商热线',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公司表单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongsi`
--

LOCK TABLES `gongsi` WRITE;
/*!40000 ALTER TABLE `gongsi` DISABLE KEYS */;
INSERT INTO `gongsi` VALUES ('安阳职业技术学院','安阳市文峰区',123456789,'1223554@qq.com','暂无','暂无','41541546415');
/*!40000 ALTER TABLE `gongsi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-23  0:14:29
