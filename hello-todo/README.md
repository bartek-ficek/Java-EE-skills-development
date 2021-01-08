# Build
mvn clean package && docker build -t pl.bartek_ficek/hello-todo .

# RUN

docker rm -f hello-todo || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-todo pl.bartek_ficek/hello-todo 