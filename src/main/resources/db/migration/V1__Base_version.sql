/*****************************/
/* Base Schema  */
/*****************************/

/*Table structure for table `tenant` */

CREATE TABLE STOCK_TRADE (
  ID INT NOT NULL,
  PRICE INT NOT NULL,
  SHARES INT NOT NULL,
  SYMBOL VARCHAR(80) NOT NULL,
  TIMESTAMP INT NOT NULL,
  TYPE VARCHAR(80) NOT NULL,
  USER_ID INT NOT NULL
)
AS
SELECT * FROM CSVREAD('./src/main/resources/csv/data.csv');

