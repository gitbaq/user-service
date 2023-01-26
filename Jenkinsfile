pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk17'
    }
    stages {
        stage ('Pre-Initialize') {
            steps{
                echo "${env.PATH}"
            }
        }
        stage ('Initialize') {
            steps {
                sh "echo $PATH"
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}