-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: db_estudiantes
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `idEstudiante` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `ci` varchar(20) DEFAULT NULL,
  `carrera` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idEstudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (1,'Juan','Perez','123156','Sistemas'),(2,'Carlitos','Baldoza','456156','Química'),(3,'Ruben','Aguirre','3442','Mecatronica'),(4,'Luis','Fuentes','45616156',NULL),(5,'Mateo','Quispe Mamani','7482910','Ingeniería de Sistemas'),(6,'Valentina','Flores Rojas','8192034','Medicina'),(7,'Sebastián','Condori Vargas','6594821','Derecho'),(8,'Sofía','Mendoza Torrez','9023841','Arquitectura'),(9,'Lucas','Choque Lima','7238495','Administración de Empresas'),(10,'Camila','Paredes Salazar','8561920','Contaduría Pública'),(11,'Diego','Apaza Huanca','6847392','Ingeniería Civil'),(12,'Isabella','Vargas Copa','9384712','Psicología'),(13,'Daniel','Rojas Gutiérrez','7748291','Ingeniería Industrial'),(14,'Valeria','Mamani Cruz','8492019','Odontología'),(15,'Andrés','Gutiérrez Tapia','6192837','Economía'),(16,'Martina','Lima Soliz','9182736','Enfermería'),(17,'Gabriel','Salazar Ortiz','7592018','Ingeniería Electrónica'),(18,'Lucía','Huanca Ríos','8837261','Comunicación Social'),(19,'Alejandro','Copa Morales','6928374','Ingeniería Comercial'),(20,'Antonella','Tapia Vega','9485761','Bioquímica y Farmacia'),(21,'Joaquín','Soliz Delgado','7182930','Ingeniería Mecánica'),(22,'Emilia','Ortiz Castellón','8675849','Ciencias Jurídicas'),(23,'Nicolás','Ríos Aramayo','6374859','Auditoría'),(24,'Renata','Morales Hinojosa','9273645','Diseño Gráfico');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) DEFAULT NULL,
  `codigo` varchar(30) DEFAULT NULL,
  `creditos` int(11) DEFAULT NULL,
  `semestre` int(11) DEFAULT NULL,
  PRIMARY KEY (`idMateria`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
INSERT INTO `materia` VALUES (16,'Cálculo I','MAT-101',5,1),(17,'Álgebra Lineal','MAT-102',4,1),(18,'Introducción a la Programación','SIS-101',5,1),(19,'Física Básica I','FIS-101',4,1),(20,'Redacción y Técnicas de Estudio','HUM-101',3,1),(21,'Cálculo II','MAT-201',5,2),(22,'Programación Orientada a Objetos','SIS-201',5,2),(23,'Estructuras de Datos','SIS-202',5,2),(24,'Física II','FIS-201',4,2),(25,'Estadística y Probabilidad','EST-201',4,2),(26,'Base de Datos I','SIS-301',5,3),(27,'Arquitectura de Computadoras','SIS-302',4,3),(28,'Ingeniería de Software I','SIS-401',5,4),(29,'Redes de Computadoras','SIS-402',4,4),(30,'Sistemas Operativos','SIS-501',5,5);
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'db_estudiantes'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-11-20 10:05:20
