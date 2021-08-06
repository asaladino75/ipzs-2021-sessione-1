# Traccia del progetto

## Fase 1

- Crea un nuovo "Progetto libero" Jenkins con i seguenti compiti:
  - Eseguire un checkout del ramo main del repository GIT https://github.com/andrea-colleoni/ipzs-2021-sessione-1.git
  - Attivare un trigger della build che scatti ad ogni push sul repository
  - Compilare l'applicazione Angular al percorso __devops/frontend/webapp/__
  - Compilare e fare il package dell'applicazione Java al percorso __devops/eclipse/devops-01/__ eseguendone anche gli unit test
  - Pubblicare gli artifacts
    - Directory di build di angular zippata
    - Jar dell'applicazione Java
  - Pubblicare i risultati degli unit test
  - Pulire l'area di lavoro

**Opzionale**: Crerae un fork del progetto originale e lavorare sul fork

**Nel caso non si faccia il fork del progetto**: Durante il lavoro della giornata, di tanto in tanto verranno pushate delle nuove modifiche sul repository.

## Fase 2

- Creare un Dockerfile per avviare un container in Docker che pubblichi l'applicazione Angular con un server Nginx
  - Il build file deve prelevare l'ultima versone della build da Jenkins; per info vedere qui [Prelevare artifact dall'ultima build](https://sfriederichs.github.io/how-to/jenkins/archive/2018/01/16/Jenkins-Build-Artifacts.html)
    - Con l'URL dell'artifact che contiene la directory dell'app Angular, eseguire diversi RUN nel container che viene buildato che facciano le seguenti operazioni:
      - Scaricare la directory zippata (wget)
      - Scompattare la directory (unzip)
      - Copiarla in un path fisso sul container (ad es. __/usr/share/nginx/html__)
- Fare la build dell'immagine e provare il container
- Creare un file per Docker compose, che definisca il servizio __frontend__ usando l'immagine prodotta con la build del Dockerfile dell'app Angular
- Verificare che il Docker compose avvii correttamente un contaoner con l'app

## Fase 3
- Automatizzare le operazioni Docker

## Fase 4
- Creare una pipline di tutto il processo