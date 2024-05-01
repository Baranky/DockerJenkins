pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/Baranky/DockerJenkins']]
                )
                bat 'mvn clean install'
            }
        }
        stage('Stop and Remove Existing Container') {
                             steps {
                                 script {
                                   // Varolan container'ı durdur ve sil
                                            bat 'docker stop demo-container '
                                            bat 'docker rm demo-container'
                                        }
                                   }
                        }
        stage('Build docker image'){
            steps{
                script{
                    docker.build("baran:${env.BUILD_NUMBER}")
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    docker.image("baran:${env.BUILD_NUMBER}").run("-d -p 8085:8085 --name demo-container")
                }
            }
        }
    }

}