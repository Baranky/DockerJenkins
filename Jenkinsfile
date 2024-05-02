
pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/master']],
                    userRemoteConfigs: [[url: 'https://github.com/Baranky/DockerJenkins.git']]
                )
                bat 'mvn clean install'
            }
        }


        stage('Build docker image'){
            steps{
                script{
                    docker.build("demo/app:${env.BUILD_NUMBER}")
                }
            }
        }



        stage('Run Docker Container') {
                    steps {
                        script {
                            docker.image("demo/app:${env.BUILD_NUMBER}").run("-d -p 4444:8080 --name demo-container")
                        }
                    }
                }

    }

}
