pipeline {
    agent any
    tools {
                  maven 'Maven 3.3.9'
                  jdk 'jdk17'
              }
    stages {
        stage('Install') {
                steps {
                    sh 'mvn install'
                }
            }
        stage('Build') {
            steps {
                sh 'mvn -e clean package'
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
            }
        }
    }
}
