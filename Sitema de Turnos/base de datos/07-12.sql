-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cenmedico
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
-- Table structure for table `especialidad`
--

DROP TABLE IF EXISTS `especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especialidad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidad`
--

LOCK TABLES `especialidad` WRITE;
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
INSERT INTO `especialidad` VALUES (1,'Pediatra'),(2,'Nutricionista'),(3,'Cardiologo'),(4,'Neurologo'),(5,'Psicologo'),(6,'Clinico'),(7,'Traumatologo');
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudio`
--

DROP TABLE IF EXISTS `estudio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudio`
--

LOCK TABLES `estudio` WRITE;
/*!40000 ALTER TABLE `estudio` DISABLE KEYS */;
INSERT INTO `estudio` VALUES (1,'Consulta'),(2,'Espinograma'),(3,'Elctrocardiograma'),(4,'Ergometria'),(5,'Ecografia'),(6,'Resonancia'),(7,'antropometria'),(8,'holter'),(9,'tomografia'),(10,'angiografía cerebral');
/*!40000 ALTER TABLE `estudio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratorio`
--

DROP TABLE IF EXISTS `laboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laboratorio` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `horario_inicio` time NOT NULL,
  `horario_final` time NOT NULL,
  `descripcion` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratorio`
--

LOCK TABLES `laboratorio` WRITE;
/*!40000 ALTER TABLE `laboratorio` DISABLE KEYS */;
INSERT INTO `laboratorio` VALUES (1,'Sangre','08:00:00','19:00:00','Ayuno 12hs previo al analisis'),(2,'Orina','10:00:00','18:00:00','Orina en ayuno'),(3,'Solido','09:00:00','15:00:00','Presentar muetra de solido '),(4,'Toxicologia','08:00:00','11:00:00','Presencia de drogas o agentes nocivos en el organismo'),(5,'Alergia','10:00:00','17:00:00','Indique al medico los sintomas que posee');
/*!40000 ALTER TABLE `laboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medico` (
  `dni` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`dni`),
  KEY `fk_medico_usuario_idx` (`id_usuario`),
  CONSTRAINT `fk_medico_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12345679 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (1,'Banille','Edgardo','41256895',1),(2,'Auche','Marcos','45216345',2),(3,'Blanco','Emilia','41758946',3),(4,'Capelli','Horacio','47152963',4),(5,'Catanese','Antonio','45821634',5),(12345678,'Perez','Roberto','48330646',6);
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico_especialidad`
--

DROP TABLE IF EXISTS `medico_especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medico_especialidad` (
  `dni_medico` int(11) NOT NULL,
  `id_especialidad` int(11) NOT NULL,
  PRIMARY KEY (`id_especialidad`,`dni_medico`),
  KEY `fk_medico_especialidad_medico_idx` (`dni_medico`),
  CONSTRAINT `fk_medico_especialidad_especialidad` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_medico_especialidad_medico` FOREIGN KEY (`dni_medico`) REFERENCES `medico` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico_especialidad`
--

LOCK TABLES `medico_especialidad` WRITE;
/*!40000 ALTER TABLE `medico_especialidad` DISABLE KEYS */;
INSERT INTO `medico_especialidad` VALUES (1,3),(1,6),(2,5),(3,1),(3,2),(4,2),(5,4),(12345678,7);
/*!40000 ALTER TABLE `medico_especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico_estudio_especialidad`
--

DROP TABLE IF EXISTS `medico_estudio_especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medico_estudio_especialidad` (
  `id_medico` int(11) NOT NULL,
  `id_especialidad` int(11) NOT NULL,
  `id_estudio` int(11) NOT NULL,
  PRIMARY KEY (`id_medico`,`id_estudio`,`id_especialidad`),
  KEY `estudio_idx` (`id_estudio`),
  KEY `especialidad_idx` (`id_especialidad`),
  CONSTRAINT `especialidad` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `estudio` FOREIGN KEY (`id_estudio`) REFERENCES `estudio` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `medico` FOREIGN KEY (`id_medico`) REFERENCES `medico` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico_estudio_especialidad`
--

LOCK TABLES `medico_estudio_especialidad` WRITE;
/*!40000 ALTER TABLE `medico_estudio_especialidad` DISABLE KEYS */;
INSERT INTO `medico_estudio_especialidad` VALUES (12345678,7,2),(1,3,3),(1,3,4),(12345678,7,6),(4,2,7),(1,3,8),(5,4,9),(5,4,10);
/*!40000 ALTER TABLE `medico_estudio_especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
INSERT INTO `tipo_usuario` VALUES (1,'medico'),(2,'secretario');
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `turno`
--

DROP TABLE IF EXISTS `turno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `turno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dni_paciente` int(11) NOT NULL,
  `dni_medico` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `id_estudio` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_turno_medico_idx` (`dni_medico`),
  KEY `fk_turno_estudio_idx` (`id_estudio`),
  CONSTRAINT `fk_turno_estudio` FOREIGN KEY (`id_estudio`) REFERENCES `estudio` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_turno_medico` FOREIGN KEY (`dni_medico`) REFERENCES `medico` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `turno`
--

LOCK TABLES `turno` WRITE;
/*!40000 ALTER TABLE `turno` DISABLE KEYS */;
INSERT INTO `turno` VALUES (1,0,1,'2017-09-09 13:00:00',1),(2,0,1,'2017-09-09 13:30:00',1),(3,0,1,'2017-09-09 13:00:00',1),(5,0,2,'2017-09-09 13:30:00',1),(6,0,2,'2017-09-09 14:00:00',1),(7,12345,3,'2017-09-09 13:00:00',1),(8,0,3,'2017-09-09 13:30:00',1),(9,0,3,'2017-09-09 14:00:00',1),(10,0,4,'2017-09-09 13:00:00',1),(11,0,4,'2017-09-09 13:30:00',1),(12,123,4,'2017-09-09 14:00:00',1),(13,0,5,'2017-09-09 13:00:00',1),(14,0,5,'2017-09-09 13:30:00',1),(15,0,5,'2017-09-09 14:00:00',1),(17,0,2,'2017-09-09 12:15:00',3),(18,0,3,'2017-09-09 12:30:00',4),(19,0,4,'2017-09-09 12:45:00',5),(20,0,5,'2017-09-09 13:00:00',6),(21,0,4,'2017-12-20 12:00:00',7),(22,0,4,'2017-12-20 15:00:00',7),(32,0,4,'2017-12-20 13:00:00',7),(33,0,4,'2017-12-20 11:00:00',7),(34,0,1,'2017-12-20 11:00:00',8),(35,0,1,'2017-12-20 11:25:00',8),(36,0,12345678,'2017-12-20 11:25:00',2),(37,0,5,'2017-12-20 11:25:00',9),(38,42643739,5,'2017-12-20 11:40:00',10),(39,0,1,'2017-12-20 11:40:00',4),(40,0,1,'2017-12-20 13:40:00',4),(41,0,1,'2017-12-20 13:50:00',3),(42,0,12345678,'2017-12-20 13:50:00',6),(43,0,12345678,'2017-12-20 03:50:00',6);
/*!40000 ALTER TABLE `turno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nick` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `id_tipousuario` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_usuario_tipo_usuario_idx` (`id_tipousuario`),
  CONSTRAINT `fk_usuario_tipo_usuario` FOREIGN KEY (`id_tipousuario`) REFERENCES `tipo_usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'user1','1234',1),(2,'user2','1234',1),(3,'user3','1234',1),(4,'user4','1234',1),(5,'user5','1234',1),(6,'rbt1','1234',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-07 10:06:58
