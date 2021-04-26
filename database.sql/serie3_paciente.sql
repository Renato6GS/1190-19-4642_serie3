-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: serie3
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `idpaciente` int NOT NULL AUTO_INCREMENT,
  `tipo_de_solicitud` varchar(45) NOT NULL,
  `no_de_afiliacion` varchar(45) NOT NULL,
  `nit` varchar(20) NOT NULL,
  `dia_nacimiento` varchar(45) NOT NULL,
  `mes_nacimiento` varchar(45) NOT NULL,
  `anio_nacimiento` varchar(45) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `estado_civil` varchar(45) NOT NULL,
  `grupo_etnico` varchar(45) NOT NULL,
  `nacionalidad` varchar(45) NOT NULL,
  `cui` varchar(45) NOT NULL,
  `departamento` varchar(45) NOT NULL,
  `municipio` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `nombres_padre` varchar(45) DEFAULT 'p',
  `nombres_madre` varchar(45) DEFAULT 'p',
  `apellidos_padre` varchar(45) DEFAULT 'p',
  `apellidos_madre` varchar(45) DEFAULT NULL,
  `telefono_padre` varchar(45) DEFAULT NULL,
  `telefono_madre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (5,'actualizacion','56879452','123489-7','20','9','29','Luis Mariano','Paz Barrientos','7984-6524','hombre','soltero','maya','Guatemalteca','2357 23589 5545','Quiché','Quiché','Quinta avenida, calle 2-3','Luis Alejandro','Maria José','Paz Ovalle','Barrientos Morales','8795-3542','8795-6245'),(8,'actualizacion','1','2','4','5','5','Josefa Alejandra','Rosales Pérez','1','hombre','unionDeHecho','garifuna','2','5','5','4','3','8','3','7','2','1','2'),(9,'inscripcion','7','8','4','6','6','José Antonio','Jiménez Moreno','56456578','mujer','soltero','garifuna','5','4','5','6','6','8','4','7','5','1','5'),(11,'inscripcion','8','9','4','8','16','Raúl Joaquín','Cuenca Torres','87','hombre','soltero','garifuna','78','7','8','8','8','8','8','8','8','8','8'),(12,'inscripcion','87948957','545875-8','13','6','11','Julia Rosal','Arenas Valero','8795-5542','mujer','soltero','ladino','Guatemalteca','8785 48789 5885','Zacapa','Zacapa','5ta. Avenida 2-3 calle','Marcelo','Ángeles Paula','Arenas Garrido','Valero Gil','7868-5878','8687-5453');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-25 19:35:57
