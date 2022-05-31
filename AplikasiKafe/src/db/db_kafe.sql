/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 10.4.24-MariaDB : Database - db_kafe
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_kafe` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db_kafe`;

/*Table structure for table `log` */

DROP TABLE IF EXISTS `log`;

CREATE TABLE `log` (
  `ID_LOG` int(10) NOT NULL AUTO_INCREMENT,
  `ID_PEGAWAI` varchar(50) DEFAULT NULL,
  `ACTION` varchar(50) NOT NULL,
  `TANGGAL` datetime NOT NULL,
  PRIMARY KEY (`ID_LOG`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `log` */

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `ID_MENU` int(10) NOT NULL AUTO_INCREMENT,
  `JENIS_MENU` varchar(50) NOT NULL,
  `NAMA_MENU` varchar(50) NOT NULL,
  `GAMBAR` longtext NOT NULL,
  `HARGA` int(10) NOT NULL,
  PRIMARY KEY (`ID_MENU`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

/*Data for the table `menu` */

insert  into `menu`(`ID_MENU`,`JENIS_MENU`,`NAMA_MENU`,`GAMBAR`,`HARGA`) values 
(1,'MAKANAN BERAT','Spaghetti Bolognese','C:\\Users\\sandhy\\Downloads\\asset menu\\spaghetti bolognese.jpeg',30000),
(2,'MAKANAN BERAT','Fried Rice With Omelette','C:\\Users\\sandhy\\Downloads\\asset menu\\fried rice with omelette.jpg',20000),
(3,'MAKANAN BERAT','Beef Burger','C:\\Users\\sandhy\\Downloads\\asset menu\\beef burger.jpg',20000),
(4,'MAKANAN BERAT','Macaroni and Cheese','C:\\Users\\sandhy\\Downloads\\asset menu\\mac and cheese.jpg',35000),
(5,'MAKANAN BERAT','Egg Mayo Toast','C:\\Users\\sandhy\\Downloads\\asset menu\\egg mayo toast.jpg',17000),
(6,'MINUMAN','Espresso','C:\\Users\\sandhy\\Downloads\\asset menu\\espresso.jpg',15000),
(7,'MINUMAN','Americano','C:\\Users\\sandhy\\Downloads\\asset menu\\americano.jpg',15000),
(8,'MINUMAN','Matcha Latte','C:\\Users\\sandhy\\Downloads\\asset menu\\matcha latte.jpg',25000),
(9,'MINUMAN','Milk Shake','C:\\Users\\sandhy\\Downloads\\asset menu\\milkshake.jpg',20000),
(10,'MINUMAN','Teh Tarik','C:\\Users\\sandhy\\Downloads\\asset menu\\Teh Tarik.jpg',15000),
(11,'DESSERT','Red Velvet','C:\\Users\\sandhy\\Downloads\\asset menu\\Red Velvet.jpg',25000),
(12,'DESSERT','Cheese Cake','C:\\Users\\sandhy\\Downloads\\asset menu\\Cheese Cake.jpg',25000),
(13,'DESSERT','Strawberry Shortcake','C:\\Users\\sandhy\\Downloads\\asset menu\\strawberry shortcake.jpg',20000),
(14,'DESSERT','Honey Waffle','C:\\Users\\sandhy\\Downloads\\asset menu\\honey waffle.jpg',25000),
(15,'DESSERT','Chocolate Lava Cake','C:\\Users\\sandhy\\Downloads\\asset menu\\chocolate lava cake.jpg',15000),
(16,'DESSERT','Banana Split','C:\\Users\\sandhy\\Downloads\\asset menu\\banana split.jpg',20000),
(17,'DESSERT','Caramel Pudding','C:\\Users\\sandhy\\Downloads\\asset menu\\caramel pudding.png',25000),
(18,'DESSERT','Apple Pie','C:\\Users\\sandhy\\Downloads\\asset menu\\apple pie.jpg',20000),
(19,'DESSERT','Dessert Box Regal','C:\\Users\\sandhy\\Downloads\\asset menu\\dessert box regal.jpg',20000);

/*Table structure for table `pegawai` */

DROP TABLE IF EXISTS `pegawai`;

CREATE TABLE `pegawai` (
  `ID_PEGAWAI` int(50) NOT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `NAMA_PEGAWAI` varchar(50) NOT NULL,
  `PRIVILEGES` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_PEGAWAI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `pegawai` */

insert  into `pegawai`(`ID_PEGAWAI`,`USERNAME`,`PASSWORD`,`NAMA_PEGAWAI`,`PRIVILEGES`) values 
(1,'admin','$2a$12$S9L2QY1CjZ1gR1rt6zxBgupTSQHP481y/E7jZufU6HNhxrwPbNSoq','admin','Admin'),
(1119281928,'sandhy','$2a$10$uI3YSv0zx2xNKsjRmX./3uEAPs/tFWzc9V4cBCzAqpBog7BNICCQW','Mochamad Sandhy Zidan Ramdhani','Manager'),
(1892172371,'zidan','$2a$10$TGC4nznMa2bUcJhE3MGdIuT0UnTR./9tWEJB9pjoyM4JBK011BfSG','Mochamad Sandhy Zidan Ramdhani','Kasir');

/*Table structure for table `pesanan` */

DROP TABLE IF EXISTS `pesanan`;

CREATE TABLE `pesanan` (
  `ID_PESANAN` int(255) NOT NULL AUTO_INCREMENT,
  `ID_PEGAWAI` varchar(50) NOT NULL,
  `NAMA_PEMESAN` varchar(50) NOT NULL,
  `NOMOR_MEJA` int(11) NOT NULL,
  `TANGGAL` datetime NOT NULL,
  `TOTAL_HARGA` int(255) NOT NULL,
  `DET_PESANAN` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`ID_PESANAN`),
  KEY `ID_PEGAWAI` (`ID_PEGAWAI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `pesanan` */

/* Trigger structure for table `pesanan` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `in_log` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `in_log` AFTER INSERT ON `pesanan` FOR EACH ROW BEGIN
	INSERT INTO LOG VALUES ( NULL ,new.ID_PEGAWAI,'Penambahan Data Pada Tabel Pesanan',now());
    END */$$


DELIMITER ;

/* Function  structure for function  `cari_pegawai` */

/*!50003 DROP FUNCTION IF EXISTS `cari_pegawai` */;
DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` FUNCTION `cari_pegawai`(`pesanan` VARCHAR(10)) RETURNS int(11)
BEGIN
	DECLARE jumlah INT;
	SELECT count(*) into jumlah FROM PESANAN
	WHERE NOMOR_MEJA=pesanan ;
	RETURN jumlah;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sel_menu` */

/*!50003 DROP PROCEDURE IF EXISTS  `sel_menu` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sel_menu`()
BEGIN
SELECT * FROM menu;
END */$$
DELIMITER ;

/* Procedure structure for procedure `tot_harga` */

/*!50003 DROP PROCEDURE IF EXISTS  `tot_harga` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `tot_harga`(`PEGAWAI` VARCHAR(10))
BEGIN
		SELECT SUM(MENU.HARGA) AS 'TOTAL_HARGA' 
		FROM PESANAN, MENU 
		WHERE PESANAN.ID_MENU=MENU.ID_MENU
		AND PESANAN.ID_PEGAWAI=PEGAWAI;
	END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
