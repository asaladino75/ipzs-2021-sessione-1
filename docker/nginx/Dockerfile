# Obiettivo: creare un'immagine personalizzata di un web server

# 1. parto da un'immagine di un OS che mi va bene (alpine)
FROM alpine
# 2. eseguo il comando per installare nginx sull'alpine
RUN apk add --no-cache nginx
# 3. altri comandi...
RUN echo "Nginx installato!!"
# 4. espongo (pubblico) una delle porte che ho a disposizione in modo che chi eseguirà il container avrà la possibilità di fare binding
EXPOSE 80
# 5. eseguo il comando che docker eseguirà sul container appena sarà riuscito ad avviarlo (entrypoint) - faccio partire nginx
CMD /usr/sbin/nginx && tail -f /dev/null