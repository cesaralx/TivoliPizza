SELECT
     clientes.`nombre` AS clientes_nombre,
     clientes.`email` AS clientes_email,
     clientes.`password` AS clientes_password,
     clientes.`numeroCasa` AS clientes_numeroCasa,
     clientes.`calle` AS clientes_calle,
     clientes.`cruceCalles` AS clientes_cruceCalles,
     clientes.`colonia` AS clientes_colonia,
     clientes.`municipio` AS clientes_municipio,
     clientes.`codigoPostal` AS clientes_codigoPostal,
     clientes.`idCliente` AS clientes_idCliente
FROM
     `clientes` clientes