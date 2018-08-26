//  Menores que 10 ou Maiores que 100

SELECT products.id, products.name FROM products 
WHERE products.price < 10 or products.price > 100;
