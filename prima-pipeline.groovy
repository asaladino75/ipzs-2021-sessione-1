def getWebappZipFile() {
    return 'frontend-webapp.zip'
}

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
        stage('Build') {
            parallel {
                stage('Build backend') {
                    steps {
                        echo 'Compilazione maven'
                        dir('eclipse/devops-01') {
                            withMaven(jdk: 'shared_jdk', maven: 'shared_maven') {
                                bat 'mvn compile'
                            }
                        }                
                        
                    }
                }
                stage('Build frontend') {
                    steps {
                        dir('frontend/webapp') {
                            withNPM(npmrcConfig: 'npm-config-base') {
                                bat 'npm install'
                                /*
                                bat 'npm install @angular/cli'
                                bat 'ng build'
                                */
                                bat 'npm run build'
                            }
                        }
                    }
                }                
            }
        }
        stage('Test & package') {
            parallel {
                stage('Testing & Packaging backend') {
                    steps {
                        dir('eclipse/devops-01') {
                            withMaven(jdk: 'shared_jdk', maven: 'shared_maven') {
                                bat 'mvn package'
                            }
                        }                
                        
                    }
                }
                stage('Packaging frontend') {
                    steps {
                        zip zipFile: "$webappZipFile", 
                            archive: true, 
                            dir: 'frontend/webapp/dist/webapp',
                            overwrite: true
                    }
                }                
            }
        }
    }
    
    post {
        success {
            bat "copy $webappZipFile c:\\Publish\\"
            bat "git tag rev-${env.BUILD_NUMBER}"
            bat "git push --tags"
        }
        failure {
            /*
            emailext (
                subject: "Build ${env.BUILD_NUMBER} del progetto ${env.JOB_NAME} fallita",
                body: "<h2>Job ${env.BUILD_NUMBER} è fallilto alle ore ###</h2>",
                to: 'andrea@colleoni.info'
                )
            */
            echo 'Failure!!!!!!'
        }
        always {
            echo 'Finish'
        }
    }
}
