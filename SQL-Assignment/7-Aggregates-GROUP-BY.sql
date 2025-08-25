select dept_id, count(*) as "Student Count" from students_Dileep
group by dept_id;

select dept_id, avg(age) as "Average Age" from students_Dileep
group by dept_id;

select max(age) , min(age) from students_Dileep;
select * from students_Dileep;
