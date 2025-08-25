-- Display student names along with their department names (INNER JOIN).
select s.student_name, d.dept_name from students_dileep s inner join departments_dileep d on s.dept_id = d.dept_id;

-- List all departments even if they have no students (LEFT JOIN).
select * from departments_dileep d left join students_dileep s on d.dept_id = s.dept_id;

-- Write a correlated subquery to list students older than their department’s average age.
select student_name from students_dileep s
where age >(
	select avg(age) from students_dileep
    group by dept_id
    having dept_id=s.dept_id
);

-- Use a CTE (Common Table Expression) to get student count per department.
with StudentCount as(
	select dept_name, count(*) as StudentCount from departments_dileep
    group by dept_id
)
select * from StudentCount;
