-- ------------------------------------------------------
-- Get the sold products by type id and document id
-- ------------------------------------------------------
select distinct prd_id as 'Product Id',
  prd_name as 'Product name',
  prd_type as 'Product type',
  prd_price as 'Price' 
	from product 
    inner join sale_has_product 
    on product_prd_id = prd_id
    where prd_id in (
	select product_prd_id 
    from sale_has_product 
    where sale_sale_id in (
	select sale_id 
    from sale 
    where customer_cusmer_id in (
	select cusmer_id 
	  from customer 
    where cusmer_type_id = 'CC' and cusmer_id_doc = '5131104935'
  )));


-- ------------------------------------------------------
-- Consult products by name and show its provider
-- ------------------------------------------------------
select distinct pder_id as 'Provider ID',
	pder_name as 'Provider name',
  pder_nit as 'Provider NIT'
  from provider
		inner join provider_has_product
		on provider_pder_id = pder_id
		where provider_pder_id in (
  select provider_pder_id 
		from provider_has_product 
		inner join product
		on product_prd_id = prd_id
		where product_prd_id in (
	select prd_id 
		from product 
    where prd_name = 'Orange'
  ));

-- ------------------------------------------------------
-- What's the most sold product
-- ------------------------------------------------------
 select t1.product_prd_id as 'Product name',
  count(t1.product_prd_id ) as Quantity,
  t2.prd_name as Product
	from sale_has_product as t1 
    inner join product as t2 
    on t1.product_prd_id = t2.prd_id 
    group by product_prd_id 
    order by Quantity desc;