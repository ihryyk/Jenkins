pipeline {
    agent any
    environment {
        DOCKER_HUB_CREDS = credentials('ihor-docker-hub')
    }
    stages {
        stage('release') {
            steps {
                sh 'docker build .'
                sh 'docker tag jenkins-jenkins:latest ihryyk/jenkins:jenkins-1'
                withCredentials([usernamePassword(credentialsId: 'ihor-docker-hub', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                    sh "docker login -u $USERNAME -p $PASSWORD"
                    sh 'docker push ihryyk/jenkins:jenkins-1'
                }
            }
        }
    }
}