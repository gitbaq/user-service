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


        stage ('Build') {
            steps {
                mvn "install"
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}