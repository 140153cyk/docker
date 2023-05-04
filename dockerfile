FROM mysql
ADD \\apps\\mysql\\source\\init.sql /docker-entrypoint-initdb.d/init.sql
