INSERT INTO clientes(id, create_at, apellido,  email, nombre) VALUES(1, '2018-03-17', 'Perez', 'pperez@gmail.com', 'Pepito');
INSERT INTO clientes(id, create_at, apellido,  email, nombre) VALUES(2, '2016-08-20', 'peña', 'npeña@gmail.com', 'Nicol');
INSERT INTO clientes(id, create_at, apellido,  email, nombre) VALUES(3, '2015-07-12', 'Ramirez', 'pramirez@gmail.com', 'Pablito');
INSERT INTO clientes(id, create_at, apellido,  email, nombre) VALUES(4, '2011-04-09', 'Pardo', 'mpardo@gmail.com', 'Maicol');

INSERT INTO productos(id,cantidad_producto,create_producto,nombre_producto,precio_producto,precio_producto_compra)  VALUES(1,15,'2020-10-01','carro',810000,600000);
INSERT INTO productos(id,cantidad_producto,create_producto,nombre_producto,precio_producto,precio_producto_compra)  VALUES(2,10,'2019-09-09','cama',980000,700000);
INSERT INTO productos(id,cantidad_producto,create_producto,nombre_producto,precio_producto,precio_producto_compra)  VALUES(3,100,'2018-03-10','licuadora',120000,99000);
INSERT INTO productos(id,cantidad_producto,create_producto,nombre_producto,precio_producto,precio_producto_compra)  VALUES(4,95,'2015-07-12','moto',2000000,1500000);


INSERT INTO encabezados(id,id_cliente,fecha_creacion_pedido,celular_destino_pedido ,direccion_destino_pedido,nombre_destino_pedido,subtotal_pedido,total_pedido,descuento_pedido,fecha_entrega_pedido,estado_pedido) values(1,1,"2020-10-11","311","cra 49 #52-26","Maci",10000,122,122312,"2020-11-09","pendiente");
INSERT INTO encabezados(id,celular_destino_pedido,descuento_pedido,direccion_destino_pedido,estado_pedido,fecha_creacion_pedido,fecha_entrega_pedido,id_cliente,nombre_destino_pedido,subtotal_pedido,total_pedido) values(2,"3126178812",20000,"cra 65 #10-12","Enviado","2020-12-09","2020-12-10",2,"Camila Arcila",120000,100000);
INSERT INTO encabezados(id,celular_destino_pedido,descuento_pedido,direccion_destino_pedido,estado_pedido,fecha_creacion_pedido,fecha_entrega_pedido,id_cliente,nombre_destino_pedido,subtotal_pedido,total_pedido) values(3,"3189026451",30000,"cra 21 #32-23","Recibido","2020-08-11","2020-08-12",3,"Felipe Navarro",130000,60000);
INSERT INTO encabezados(id,celular_destino_pedido,descuento_pedido,direccion_destino_pedido,estado_pedido,fecha_creacion_pedido,fecha_entrega_pedido,id_cliente,nombre_destino_pedido,subtotal_pedido,total_pedido) values(4,"3182671232",11000,"cra 12 #321-212","Pendiente","2020-02-12","2020-02-13",4,"Dario Alcazar",90000,79000);

INSERT INTO detalles(id,cantidad_detalle,descuento_detalle,id_producto,valor_detalle) values(1,5,10000,1,130000);
INSERT INTO detalles(id,cantidad_detalle,descuento_detalle,id_producto,valor_detalle) values(2,2,15000,2,110000);
INSERT INTO detalles(id,cantidad_detalle,descuento_detalle,id_producto,valor_detalle) values(3,12,20000,3,30000);
INSERT INTO detalles(id,cantidad_detalle,descuento_detalle,id_producto,valor_detalle) values(4,9,40000,4,160000);