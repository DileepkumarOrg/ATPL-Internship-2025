-- Add a new column to courses:
Alter table courses_dileep add course_code varchar(10);

-- Make course_code UNIQUE
alter table courses_dileep add constraint unique_code unique(course_code);

-- Add CHECK constraint to courses table
alter table courses_dileep add credits int check(credits between 1 and 5);

-- update coursecodes
UPDATE courses_dileep SET course_code='CS101', credits=4 WHERE course_id='C1';
UPDATE courses_dileep SET course_code='MATH205', credits=3 WHERE course_id='C2';
UPDATE courses_dileep SET course_code='PHY303', credits=5 WHERE course_id='C3';
