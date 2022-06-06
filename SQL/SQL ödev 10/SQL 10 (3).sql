-- 3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
SELECT rental_id,first_name,last_name FROM customer
FULL OUTER JOIN rental ON rental.customer_id = customer.customer_id;