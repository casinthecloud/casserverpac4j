# CAS server for pac4j demos

Running online at Heroku: `https://casserverpac4j.herokuapp.com/login`

Running locally on `http://localhost:8080` via: `mvn clean package; java -Xmx256m -Dapp.domain=http://localhost:8080 -Dapp.port=8080 -jar target/cas.war`

Using `heroku config:set JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCompactObjectHeaders -XX:+UseSerialGC -Xmx256m -Xss512k -XX:MaxDirectMemorySize=64M -XX:MaxMetaspaceSize=128M -Dspring.jmx.enabled=false"` to limit memory consumption on Heroku.
