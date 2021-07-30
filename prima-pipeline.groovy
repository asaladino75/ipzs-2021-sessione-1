pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('GIT checkout') {
            steps {
                git branch: 'main', 
                    url: 'https://github.com/andrea-colleoni/ipzs-2021-sessione-1.git'
                    
                bat 'dir'
            }
        }
        stage('Compilazione') {
            steps {
                echo 'Compilazione maven'
                dir('eclipse/devops-01') {
                    withMaven(jdk: 'JDK 11', maven: 'Maven 3.8.1') {
                        bat 'mvn compile'
                    }
                }                
                
            }
        }
        stage('Testing') {
            steps {
                dir('eclipse/devops-01') {
                    withMaven(jdk: 'JDK 11', maven: 'Maven 3.8.1') {
                        bat 'mvn test'
                    }
                }                
                
            }
        }        
    }
}
