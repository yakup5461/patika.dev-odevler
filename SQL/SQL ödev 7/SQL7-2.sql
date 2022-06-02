SELECT replacement_cost,COUNT(title) FROM film
GROUP BY replacement_cost, length
HAVING length >50 ;