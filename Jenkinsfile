pipeline {
    agent any
    stages {
        stage('release') {
            steps {
                    sh 'docker compose build'
                    sh 'docker tag jenkins-jenkins:latest ihryyk/jenkins:jenkins-1'
                    sh 'docker push ihryyk/jenkins:jenkins-1'
            }
        }
    }
}