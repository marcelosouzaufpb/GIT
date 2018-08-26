// Produtos Importados

select p.name, pv.name, c.name from products p 
    join providers pv on p.id_providers = pv.id
    join categories c on p.id_categories = c.id
    where c.name = 'Imported' and pv.name = 'Sansul SA';
