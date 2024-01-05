SELECT * from users;
desc users;
SELECT * from addresses;
SELECT * from locations;
SELECT * from vehicles;


INSERT INTO addresses values(2,'Home','Delhi','IND','Sonarpur','garia','700150',1,'WB',24);
INSERT INTO users values (1,23,'abc@jhff','test','paswan','12345','abc');
INSERT INTO users values (2,24,'abc@jhff','test','paswan','12345','abc','');

truncate users;

truncate addresses;

SELECT * from trips;
SELECT * from reviews;
SELECT * from vehicles;
SELECT * from users;

SELECT * from student_details;
SELECT * from student_details where studid= 1005;

SET @userinput = 1006;
SELECT * from student_details where studid= @z;



CREATE TABLE teacher (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    creation_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO teacher (name) values('Atul');

SELECT * from teacher;
SELECT * from teacher where creation_time >= '2024-01-05 00:00:01';
SELECT * from teacher where (CURRENT_TIMESTAMP - creation_time) >= '2024-01-05 21:00:00';


SELECT CURRENT_TIME from dual;
SELECT CURRENT_TIMESTAMP from dual;

SELECT * from teacher where creation_time >= NOW() - INTERVAL 5 HOUR;



SET @intervalIp = TIMESTAMPADD(HOUR, 5, CURRENT_TIMESTAMP);


SELECT * from teacher where creation_time >= NOW() - @intervalIp;
SELECT * from teacher where creation_time >= NOW() - INTERVAL 3 dayofmonth;

SELECT * from teacher where creation_time >= '2022-03-01 00:00:01';
SELECT * from teacher where creation_time >= NOW() - INTERVAL 22 month;

SELECT * from teacher where DATE(timestamp) = curdate();
SELECT * from teacher where year(creation_time);

SELECT DATE(creation_time) from teacher where name = 'Atul';
SELECT year(creation_time) from teacher where name = 'Atul';
SELECT month(creation_time) from teacher where name = 'Atul';

SELECT hour(creation_time) from teacher where name = 'Atul';






