DELETE FROM employee
WHERE id = 10
RETURNING *;

DELETE FROM employee
WHERE name LIKE 'sql query'
RETURNING *;

DELETE FROM employee
WHERE birthday < '1950-01-01'
RETURNING *;

DELETE FROM employee
WHERE email = 'patika@dev.com'
RETURNING *;

DELETE FROM employee
WHERE id = 20
RETURNING *;