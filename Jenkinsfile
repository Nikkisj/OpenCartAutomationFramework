pipeline {

    agent any

    tools {

        maven 'Maven'
    }

    stages {

        stage('Clone Repository') {

            steps {

                git 'YOUR_GITHUB_REPOSITORY_URL'
            }
        }

        stage('Build Project') {

            steps {

                bat 'mvn clean test'
            }
        }
    }
}