CREATE TABLE TRAININGPLAN(
	TRAINING_PLAN_COD INTEGER NOT NULL,
	NAME VARCHAR(20),
	PRICE_MONTH INTEGER DEFAULT 0,
	CONSTRAINT PK_TRAININGPLAN PRIMARY KEY (TRAINING_PLAN_COD)
);

INSERT INTO TRAININGPLAN VALUES(1153,'Gain Muscle',20);
INSERT INTO TRAININGPLAN VALUES(1423,'Loss fat',15);
INSERT INTO TRAININGPLAN VALUES(6543,'Running',10);
INSERT INTO TRAININGPLAN VALUES(7937,'Body Building',30);
INSERT INTO TRAININGPLAN VALUES(4561,'Gain Strenght',40);
INSERT INTO TRAININGPLAN VALUES(9982,'Calisthenics',15);

CREATE TABLE TRAINER(
	PHOTO_TITLE VARCHAR(20),
	NID VARCHAR(20) NOT NULL,
	USERNAME VARCHAR(20) NOT NULL,
	PASSWORD VARCHAR(20) NOT NULL,
	DISCHARGE_DATE DATE,
	CONSTRAINT PK_TRAINER PRIMARY KEY (NID)
);

INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image6.jpg', '23048646R', 'Mario', '1jgs26tXTe', '2004-12-09');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '52011402F', 'María', 'G4tykuY8Rf', '2016-02-02');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image3.jpg', '76622438P', 'Pedro', 'iSPgkcwrW0', '2017-02-04');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image3.jpg', '82030109B', 'Mariano', '0XwEViUeDU', '2004-03-26');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '94371484T', 'Carmen', 'Hyh7QuAXAF', '2000-12-13');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image2.jpg', '72549674S', 'Pedro', 'yp9H3eeBpc', '2006-11-03');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '91736520P', 'Lola', 'o9p5Mht6Np', '2005-03-09');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image10.jpg', '37187868L', 'Pedro', 'bBehkfLgqj', '2007-12-14');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '18653804E', 'María', 'cHRskR6Not', '2014-10-11');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image6.jpg', '48940346A', 'Diego', 'krOLETdWGy', '2012-02-14');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '95420841M', 'María', 'KF0ErafZVH', '2006-08-23');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image1.jpg', '49800694J', 'Carmen', 'krOLETdWGa', '2016-04-16');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image9.jpg', '52863674Z', 'Pedro', 'G4tykuY8RK', '2010-04-05');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image8.jpg', '39841488Z', 'Fran', 'XCUwuLA9k2', '2018-12-27');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image6.jpg', '35898337Y', 'Antonio', 'bBehkfLgqf', '2017-03-15');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image1.jpg', '78969653G', 'Rafael', 'gPa6F9KSMn', '2011-12-12');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image3.jpg', '48685087K', 'Diego', 'CDm23qS11x', '2009-07-13');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image6.jpg', '55567382A', 'Mariano', 'kHcSxHdUnf', '2003-12-11');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '69551875J', 'Mariano', 'CyiteFr4nH', '2019-08-18');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image5.jpg', '47367851H', 'Juan', 'CDm23qS11q', '2000-06-21');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image6.jpg', '26329876M', 'Sandra', 'uD3YBxUidc', '2020-11-05');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image7.jpg', '62647688N', 'Carmen', 'iZR0gsFMxi', '2015-01-17');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image9.jpg', '15481789Y', 'Fran', 'gJMJAQ00KK', '2016-03-05');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image10.jpg', '46382009W', 'Mariano', 'XCUwuLA9kf', '2002-04-20');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image2.jpg', '31227669V', 'Juan', 'w8RoFegVl5', '2001-04-24');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image1.jpg', '61920597C', 'Rafael', 'iZR0gsFMxc', '2005-03-23');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '18128677P', 'Carmen', 'ZUXFvMx0ya', '2010-11-20');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image9.jpg', '15303939S', 'Sandra', 'gJMJAQ00Kv', '2015-05-24');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image3.jpg', '83653737T', 'Rafael', '6uTQdm7DYg', '2008-02-10');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image1.jpg', '76125850J', 'Laura', 'yp9H2eeBpc', '2000-06-11');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image8.jpg', '57035339P', 'Pedro', 'kHcSxHdUnX', '2021-07-21');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image1.jpg', '96226241Z', 'Rafael', 'LO879HpbvZ', '2020-11-02');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image6.jpg', '70158578E', 'María', 'CyiteFr2nH', '2001-03-05');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image10.jpg', '19106074C', 'Carmen', 'cHRskR6Yet', '2021-11-08');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '22792285K', 'Mariano', '1jgs26tXTg', '2000-12-01');
INSERT INTO TRAINER (PHOTO_TITLE, NID, USERNAME, PASSWORD, DISCHARGE_DATE) VALUES ('image4.jpg', '28220437N', 'ACG', 'root', '2019-04-24');

UPDATE CLIENT SET NID = '28220437N' WHERE NID = '47563823F';

CREATE TABLE CLIENT(
	CLIENT_COD INTEGER NOT NULL,
	DISCHARGE_DATE DATE,
	FULL_NAME VARCHAR(30),
	AGE INTEGER,
	NID VARCHAR(20),
	CONSTRAINT FK_CLIENT FOREIGN KEY (NID)  REFERENCES TRAINER,
	CONSTRAINT PK_CLIENT PRIMARY KEY (CLIENT_COD)
);

INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (920, '2002-07-04', 'Mario López', 56, '28220437N');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (254, '2016-01-28', 'Salvador Sánchez', 59, '19106074C');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (341, '2018-10-19', 'Mario López', 17, '91736520P');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (430, '2001-09-21', 'Lola Sánchez', 55, '76622438P');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (687, '2009-02-28', 'Lola Sánchez', 38, '28220437N');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (599, '2018-02-04', 'Juan Calatrava', 46, '28220437N');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (541, '2003-05-11', 'Mario López', 59, '83653737T');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (663, '2000-01-17', 'Juan Calatrava', 75, '28220437N');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (278, '2014-05-13', 'Mario López', 56, '52863674Z');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (307, '2000-04-18', 'Diego Blanca', 42, '26329876M');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (117, '2021-05-11', 'Lola Sánchez', 41, '69551875J');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (737, '2014-12-05', 'Lola Sánchez', 31, '28220437N');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (710, '2014-04-18', 'Francisco Borrego', 40, '70158578E');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (925, '2019-03-28', 'Salvador Sánchez', 80, '37187868L');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (450, '2005-03-08', 'Francisco Borrego', 56, '39841488Z');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (309, '2009-09-04', 'Salvador Sánchez', 22, '22792285K');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (824, '2004-01-21', 'Salvador Sánchez', 41, '95420841M');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (884, '2012-03-08', 'Lola Sánchez', 56, '91736520P');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (540, '2015-03-16', 'Bruno García', 16, '18653804E');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (698, '2019-05-06', 'Lola Sánchez', 39, '28220437N');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (288, '2013-05-17', 'Bruno García', 33, '91736520P');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (377, '2006-10-24', 'Bruno García', 28, '18653804E');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (868, '2018-08-13', 'Lola Sánchez', 77, '76125850J');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (606, '2009-09-10', 'Mario López', 31, '39841488Z');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (963, '2008-09-09', 'Salvador Sánchez', 16, '61920597C');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (154, '2016-07-12', 'Diego Blanca', 28, '57035339P');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (143, '2016-05-07', 'Salvador Sánchez', 18, '49800694J');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (565, '2000-12-16', 'Francisco Borrego', 32, '83653737T');
INSERT INTO CLIENT (CLIENT_COD, DISCHARGE_DATE, FULL_NAME, AGE, NID) VALUES (971, '2015-03-05', 'Francisco Borrego', 51, '23048646R');

CREATE TABLE MONTHLYPAYMENT(
	PAYMENT_COD INTEGER NOT NULL,
	CLIENT_COD INTEGER,
	TRAINING_PLAN_COD INTEGER,
	PAYMENT INTEGER,
	CONSTRAINT FK_MONTHLYPAYMENT FOREIGN KEY (CLIENT_COD) REFERENCES CLIENT,
	CONSTRAINT FK_MONTHLYPAYMENT2 FOREIGN KEY (TRAINING_PLAN_COD) REFERENCES TRAININGPLAN,
	CONSTRAINT PK_MONTHLYPAYMENT PRIMARY KEY (PAYMENT_COD,CLIENT_COD,TRAINING_PLAN_COD)
);

INSERT INTO MONTHLYPAYMENT VALUES(38708,254,6543,40);
INSERT INTO MONTHLYPAYMENT VALUES(64763,599,1153,20);
INSERT INTO MONTHLYPAYMENT VALUES(95537,254,1153,17);
INSERT INTO MONTHLYPAYMENT VALUES(32975,824,1153,10);
INSERT INTO MONTHLYPAYMENT VALUES(82548,884,6543,30);
INSERT INTO MONTHLYPAYMENT VALUES(48803,884,1153,21);
INSERT INTO MONTHLYPAYMENT VALUES(55936,698,4561,17);
INSERT INTO MONTHLYPAYMENT VALUES(63540,341,4561,21);
INSERT INTO MONTHLYPAYMENT VALUES(53546,737,1153,27);
INSERT INTO MONTHLYPAYMENT VALUES(49358,540,6543,17);
INSERT INTO MONTHLYPAYMENT VALUES(75049,309,6543,30);
INSERT INTO MONTHLYPAYMENT VALUES(19664,341,9982,31);
INSERT INTO MONTHLYPAYMENT VALUES(72533,884,1423,20);
INSERT INTO MONTHLYPAYMENT VALUES(70604,117,1153,34);
INSERT INTO MONTHLYPAYMENT VALUES(66143,278,1423,34);
INSERT INTO MONTHLYPAYMENT VALUES(78145,377,7937,38);
INSERT INTO MONTHLYPAYMENT VALUES(67944,963,1153,30);
INSERT INTO MONTHLYPAYMENT VALUES(26402,540,6543,25);
INSERT INTO MONTHLYPAYMENT VALUES(92756,430,7937,36);
INSERT INTO MONTHLYPAYMENT VALUES(55947,278,6543,11);
INSERT INTO MONTHLYPAYMENT VALUES(60040,663,4561,33);