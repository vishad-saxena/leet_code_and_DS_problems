Q1. fetchg values in table x and not in y without using NoT keyword
ANS. Select x.* from X as x leftJoin Y as y on x.id=y.album_id where y.album_id IS NULL;

Q2. retrieve the list of courses that a specific student is enrolled in, you can use an SQL JOIN operation(MANY-TO-MANY)
ANS. select c.courseId from Courses c join Enrollment e on c.courseId = e.courseId where e.studentId = '123';
SELECT Courses.CourseName
FROM Courses
INNER JOIN Enrollments ON Courses.CourseID = Enrollments.CourseID
WHERE Enrollments.StudentID = 123; -- Replace with the desired StudentID

