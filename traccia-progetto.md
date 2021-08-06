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
