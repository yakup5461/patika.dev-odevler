UPDATE employee
SET name = 'aaaaa'
WHERE id=1;

UPDATE employee
SET name = 'bbbbb'
WHERE name LIKE 'aaaaa';

UPDATE employee
SET  birthday= '1980-01-02'
WHERE name LIKE 'bbbbb';

UPDATE employee
SET  email = 'patika@dev.com'
WHERE birthday = '1980-01-02';


UPDATE employee
SET  name = 'sql query'
WHERE email LIKE 'patika@dev.com';