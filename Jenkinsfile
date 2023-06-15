pipeline {
    agent any
    
    stages {
        stage('Build Maven Project') {
            steps {
                git branch: 'main',
                    credentialsId: 'github-credentials',
                    url: 'https://github.com/omkarBrainWave/CI_CD_Genkins'
                
                withMaven(maven: 'maven') {
                    sh 'mvn clean package'
                }
            }
        }
        
        stage('Build Docker Image') {
            steps {
                script {
                    def dockerImage = docker.build('my-docker-image')
                }
            }
        }
        
        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                        def dockerImage = docker.image('my-docker-image')
                        dockerImage.push('latest')
                    }
                }
            }
        }
        
    }
}


credentials {
    usernamePassword(
        credentialsId: 1234 ,
        usernameVariable: 'omkarBrainWave',
        passwordVariable: 'Brain@#12'
                    )
    
    usernamePassword(
        credentialsId: 12345 ,
        usernameVariable: 'omkar',
        passwordVariable: 'omkar'
    )
}
