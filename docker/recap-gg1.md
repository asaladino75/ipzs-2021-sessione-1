# Riassunto del giorno 1

## Comandi

- __docker pull nginx__ => scarica l'immagine da dockerhub
- __docker images__ => elenco delle immagini sul registry locale (cache)
- __docker run -d --name web-01 nginx__ => esegue (run = create + start) un container in background partendo da un'immagine
- __docker logs web-01__: mostra la tail del log del container
- __docker stats web-01__: mostra le statistiche "live" dell'utilizzo di risorse (CPU, RAM, ecc.)
- __docker inspect web-01__: mostra la configurazione attuale del container
- __docker exec -it web-01 sh__: esecuzione di una shell interattiva sul container
- __docker run -d --name web-01 -p 8000:80  nginx__: run con binding di porta tcp (la forma è PORTA_HOST:PORTA_CONTAINER)

- __docker build -t corso_nginx .__: build di un immagine da Dockerfile
- __docker run -d --name web-02 -p 8001:80  corso_nginx__: run del container dall'immagine appena buildata