--city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini
--birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT city , country FROM city
INNER JOIN  country ON city.city_id = country.country_id ;