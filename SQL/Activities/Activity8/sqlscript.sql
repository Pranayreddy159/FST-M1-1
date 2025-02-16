REM   Script: Activity8
REM   Activity7

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT salesman_id,salesman_city from salesman;

SELECT salesman_id,salesman_city from salesman;

SELECT salesman_id,salesman_city from salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, salesman_city FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman set grade=200 where salesman_city='Rome';

UPDATE salesman set grade=300 where salesman_city='James Hoog';

SELECT * FROM salesman;

UPDATE salesman set salesman_name='Pierre' where salesman_name='McLyon';

SELECT * FROM salesman;

SELECT * from salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT DISTINCT salesman_id FROM salesman;

SELECT 1 FROM DUAL;

SELECT * from orders;

SELECT ORDER_NO from orders order by ORDER_DATE;

SELECT ORDER_NO,purchase_amount from orders order by purchase_amount desc;

SELECT * from orders where purchase_amount<500;

SELECT * from orders where purchase_amount between 1000 and 2000;

select * from salesman;

select * from orders;

    SELECT SUM(purchase_amount) from orders;

    SELECT avg(purchase_amount) from orders;

    SELECT avg(purchase_amount) from orders;

    SELECT max(purchase_amount) from orders;

    SELECT min(purchase_amount) from orders;

    SELECT count(*) from salesman;

select * from orders;

select * from orders;

select max(purchase_amount) group by CUSTOMER_ID order by CUSTOMER_ID,purchase_amount DESC;

select max(purchase_amount) group by CUSTOMER_ID from orders order by CUSTOMER_ID,purchase_amount DESC;

select max(purchase_amount) group by CUSTOMER_ID from orders order by CUSTOMER_ID;

select max(purchase_amount) as max_amount group by CUSTOMER_ID from orders order by CUSTOMER_ID;

select customer_id,max(purchase_amount) as max_amount  from orders group by CUSTOMER_ID;

select customer_id,max(purchase_amount) as max_amount  from orders where date="2012-08-17";

select * from orders;

select customer_id,max(purchase_amount) as max_amount  from orders where ORDER_DATE="2012-08-17";

select * from salesman;

select SALESMAN_ID,max(purchase_amount) as max_amount  from orders where ORDER_DATE=to_date("2012-08-17","yyyy-mm-dd");

select SALESMAN_ID,max(purchase_amount) as max_amount  from orders where ORDER_DATE=to_date('2012-08-17','yyyy-mm-dd') group by salesman_id,order_date;

select customer_id,oder_date,max(purchase_amount) as max_amount  from orders group by CUSTOMER_ID,order_date having max(purchase_amount) in [2030, 3450, 5760, 6000];

select customer_id,oder_date,max(purchase_amount) as "max_amount"  from orders group by CUSTOMER_ID,order_date having max(purchase_amount) in[2030, 3450, 5760, 6000];

select customer_id,oder_date,max(purchase_amount) as "max_amount"  from orders group by CUSTOMER_ID,order_date having max(purchase_amount) in(2030, 3450, 5760, 6000);

select customer_id,order_date,max(purchase_amount) as "max_amount"  from orders group by CUSTOMER_ID,order_date having max(purchase_amount) in(2030, 3450, 5760, 6000);

