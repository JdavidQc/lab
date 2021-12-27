-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_inv
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tblcatesubcate`
--

DROP TABLE IF EXISTS `tblcatesubcate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblcatesubcate` (
  `idCateSub` int NOT NULL AUTO_INCREMENT,
  `idCategoria` int NOT NULL,
  `idSubCategoria` int DEFAULT NULL,
  PRIMARY KEY (`idCateSub`),
  KEY `idCategoria` (`idCategoria`),
  KEY `tblcatesubcate_ibfk_2` (`idSubCategoria`),
  CONSTRAINT `tblcatesubcate_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `tblcategoria` (`idCategoria`),
  CONSTRAINT `tblcatesubcate_ibfk_2` FOREIGN KEY (`idSubCategoria`) REFERENCES `tblsubcategoria` (`idSubCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcatesubcate`
--

LOCK TABLES `tblcatesubcate` WRITE;
/*!40000 ALTER TABLE `tblcatesubcate` DISABLE KEYS */;
INSERT INTO `tblcatesubcate` VALUES (11,1,NULL),(12,2,NULL),(13,3,1),(14,3,2),(15,3,3),(16,3,4),(17,3,5),(18,3,6),(19,3,7),(20,3,8),(21,3,9),(22,3,10),(23,3,11),(24,3,12),(25,3,13),(26,3,14),(27,4,NULL);
/*!40000 ALTER TABLE `tblcatesubcate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-27 11:33:19
