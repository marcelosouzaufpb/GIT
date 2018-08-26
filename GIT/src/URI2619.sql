// Super Luxo

select p.name, pv.name, p.price
 from products p
 join providers pv on p.id_providers = pv.id
 join categories c on p.id_categories = c.id
 where c.name = 'Super Luxury'
 and p.price > 1000;
