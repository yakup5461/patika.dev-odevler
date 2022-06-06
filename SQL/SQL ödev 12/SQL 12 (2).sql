--film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
SELECT COUNT(*) FROM film
WHERE film.rental_rate = 
(SELECT MAX(film.rental_rate) FROM film
);