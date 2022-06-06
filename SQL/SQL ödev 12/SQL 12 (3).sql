--film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
SELECT * FROM film
WHERE film.rental_rate = 
(SELECT MIN(film.rental_rate) FROM film) AND
film.replacement_cost = (
 SELECT MIN(film.replacement_cost) FROM film
);