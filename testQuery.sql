SELECT surname
FROM employees
ORDER BY experience DESC
OFFSET 1 ROW
FETCH NEXT 1 ROW ONLY;