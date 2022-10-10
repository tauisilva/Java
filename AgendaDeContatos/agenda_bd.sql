CREATE DATABASE  IF NOT EXISTS `agenda_bd2` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `agenda_bd2`;
--
-- Table structure for table `contato`
--

DROP TABLE IF EXISTS `contato`;
CREATE TABLE `contato` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(256) NOT NULL,
  `telefone` varchar(32) NOT NULL,
  `email` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

