
## Mapping di volumi

docker run -d --name web-01 -p 8000:80 -v C:\Users\andre\Desktop\Temp\Corsi\Avalon\Zecca\sessione-1\docker\nginx\sito:/usr/share/nginx/html nginx

## Debug remoto

- docker run -p 9000:8000 -e "JPDA_ADDRESS=8000" -e "JPDA_TRANSPORT=dt_socket"

- java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000 -jar /java/devops-01-0.0.1-SNAPSHOT.jar