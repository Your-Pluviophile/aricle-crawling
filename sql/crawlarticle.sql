/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.37-log : Database - crawlarticle
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`crawlarticle` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `crawlarticle`;

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `pk_id` bigint(19) NOT NULL COMMENT '文章Id',
  `article_name` varchar(64) DEFAULT NULL COMMENT '文章名称',
  `article_author` varchar(20) DEFAULT NULL COMMENT '文章作者',
  `gmt_create` datetime DEFAULT NULL COMMENT '创造时间',
  `article_url` varchar(256) DEFAULT NULL COMMENT '文章爬取链接',
  `article_show_pic` varchar(256) DEFAULT NULL COMMENT '文章展示图片url',
  PRIMARY KEY (`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `article` */

insert  into `article`(`pk_id`,`article_name`,`article_author`,`gmt_create`,`article_url`,`article_show_pic`) values (1575778363872698370,'努力创造不负革命先辈期望的新业绩','央视网','2022-09-30 15:44:17','https://www.163.com/news/article/HIHA18F1000189FH.html','https://nimg.ws.126.net/?url=http%3A%2F%2Fcms-bucket.ws.126.net%2F2022%2F0930%2F89a27e44j00rj0itl002kc000m800etc.jpg&thumbnail=660x2147483647&quality=80&type=jpg'),(1575778367286861825,'他们没有白头偕老,却留下最动人的爱情','新华社','2022-09-30 15:46:02','https://www.163.com/news/article/HIHA4EQV000189FH.html','https://nimg.ws.126.net/?url=http%3A%2F%2Fcms-bucket.ws.126.net%2F2022%2F0930%2Fa4c8f4a4j00rj0iwa008nc000u001ffc.jpg&thumbnail=660x2147483647&quality=80&type=jpg'),(1575778367286861826,'格鲁吉亚驻华大使谈他眼中的“一带一路”','中国网','2022-09-30 16:04:36','https://www.163.com/news/article/HIHB6EUM000189FH.html','https://nimg.ws.126.net/?url=http%3A%2F%2Fcms-bucket.ws.126.net%2F2022%2F0930%2Fd8f14659j00rj0jr9000wc000jg00czc.jpg&thumbnail=660x2147483647&quality=80&type=jpg'),(1575778367353970689,'科学精准做好国庆假期疫情防控','新华社客户端','2022-09-30 11:39:56','https://www.163.com/news/article/HIGS1RDL000189FH.html','https://nimg.ws.126.net/?url=http%3A%2F%2Fcms-bucket.ws.126.net%2F2022%2F0930%2Ffc914144j00rj07hj0025c000sf00iyc.jpg&thumbnail=660x2147483647&quality=80&type=jpg'),(1575778367353970690,'农业数字化技术员丨陈鑫：给农作物“把脉开方”','央视新闻客户端','2022-09-30 12:11:25','https://www.163.com/news/article/HIGTRG39000189FH.html','https://nimg.ws.126.net/?url=http%3A%2F%2Fcms-bucket.ws.126.net%2F2022%2F0930%2Ffe95f387j00rj08wv006cc000hs0098c.jpg&thumbnail=660x2147483647&quality=80&type=jpg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
