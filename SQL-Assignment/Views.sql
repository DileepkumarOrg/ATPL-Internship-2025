--  Create a view that shows student names along with their department names.
create view student_department as select s.student_name, d.dept_name from students_dileep s join departments_dileep d on s.dept_id = d.dept_id;

--  Query the view to display data.
select * from student_department;

-- Attempt to update data via the view (observe if it succeeds or fails and why).
update student_department set student_name = "Dileep" where student_name = "Ravi";
