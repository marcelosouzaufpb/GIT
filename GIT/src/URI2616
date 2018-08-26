// Nenhuma Locação

select c.id, c.name
    from customers c
    where c.id not in (select l.id_customers from locations l) order by c.id; 
