# JdbcTemplateSpringMysql
Same way done as springjdbc connection.

we have to make DAObean.xml


url is called as controller as /users

then it will call controller, from controller, DAO bean is created it will call the save() or others 
methods. Then it DAOImpl is called, where jdbcTemplate, Datasourece are set and thy will do the exact
database functions.
