pipeline {
    agent any
    tools {
        maven "3.9.2"
    }
    
    stages {
        stage('Build Maven Project') {
            steps {
                checkout([$class: 'GitSCM',
                    branches: [[name: '*/main']],
                    extensions: [],
                    userRemoteConfigs: [[usernameVariable: 'omkarBrainWave', passwordVariable: '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', url: 'https://github.com/omkarBrainWave/CI_CD_Genkins.git']]])
                
                bat 'mvn clean package'
            }
        }
        stage('Build Docker Image'){
            steps {
                docker build -t omkarbrainwave/cicdpipeline:latest .             
                docker login -u="omkarbrainwave" -p="Brain@#123"
          }
          }  
    }
}
