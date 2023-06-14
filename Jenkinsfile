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
        
        stage('Push Docker Image to Kubernetes Cluster') {
            steps {
                script {
                    // Perform the necessary steps to push the Docker image to your Kubernetes cluster.
                    // This may vary depending on your cluster setup. You can use tools like kubectl or helm.
                    // Make sure you have the necessary credentials and configuration for your cluster.
                    // Example:
                    sh 'kubectl apply -f deployment.yaml'
                }
            }
        }
    }
}


credentials {
    usernamePassword(
        credentialsId: ,
        usernameVariable: 'omkarBrainWave',
        passwordVariable: 'Brain@#12'
    )
    
    usernamePassword(
        credentialsId: 'docker-hub-credentials',
        usernameVariable: 'omkar',
        passwordVariable: 'omkar'
    )
}
