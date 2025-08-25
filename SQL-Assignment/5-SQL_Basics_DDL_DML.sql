use intern;

-- 1. Create Tables

create table departments_Dileep(
	dept_id varchar(5) Primary key,
	dept_name varchar(50)
);

create table courses_Dileep(
	course_id varchar(5) primary key,
	course_name varchar(50),
	dept_id varchar(5),
	foreign key (dept_id) references departments_Dileep(dept_id)
);

CREATE TABLE students_Dileep (
    student_id VARCHAR(5) primary key,
    student_name VARCHAR(50),
    dob DATE,
    age INT,
    dept_id VARCHAR(5),
    FOREIGN KEY (dept_id) REFERENCES departments_Dileep(dept_id)
);

-- 2. Insert Sample Records

Insert into departments_Dileep values
	("D1", "Computer Science"),
	("D2", "Mathematics"),
	("D3", "Physics");
 
 
Insert into courses_Dileep values
	("C1", "DBMS", "D1"),
	("C2", "Linear Algebra", "D2"),
    ("C3", "Quantum Mechanics", "D3");

Insert into students_Dileep values
	("S1", "Ravi", "2002-06-10", 22, "D1"),
	("S2", "Sneha", "2001-03-15", 23, "D2"),
	("S3", "Arjun", "2003-01-20", 21, "D1");


-- 3. Alter Table
	
Alter table courses_Dileep Add duration int;


-- 4. Update Data

update  students_Dileep
set student_name = "Sneha Reddy"
where student_id = "S2";


-- 5. Delete Data

delete from courses_Dileep
where course_id = "C3";



