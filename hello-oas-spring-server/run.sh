lsof -i tcp:8080 | grep LISTEN | awk '{ print $2 }' | xargs kill
mvn clean spring-boot:run
