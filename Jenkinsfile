pipeline {
    agent any

    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/Baranky/DockerJenkins']]
                )git initgi
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
                    docker.image("baran:${env.BUILD_NUMBER}").run("-d -p 8080:8080 --name demo-container")
                }
            }
        }
    }
}