# tempstore
repository that contains projects for storing temperature from sensor, possible also to add humidity

It uses mysql db with development setup:
username: tempstore
password: tempstore
db_name: tempstore

to start with this docker can be used with the following container:
docker run --name mysql-tempstore -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=tempstore -e MYSQL_USER=tempstore -e MYSQL_PASSWORD=tempstore -p 3306:3306 -d mysql:5.7