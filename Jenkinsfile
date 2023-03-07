pipeline {
    agent any
    tools {
                  maven 'Maven 3.3.9'
                  jdk 'jdk17'
              }
    stages {

        stage('Build') {
            steps {
                sh 'mvn -e clean install package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }

        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
                input message: 'Finished using the web site? (Click "Proceed" to continue)'
                sh './jenkins/scripts/kill.sh'
            }
        }
    }
}
