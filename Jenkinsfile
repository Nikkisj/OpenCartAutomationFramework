pipeline {

    agent any

    tools {

        maven 'Maven'
    }

    stages {

        stage('Clone Repository') {

            steps {

                git 'https://github.com/Nikkisj/OpenCartAutomationFramework'
            }
        }

        stage('Build Project') {

            steps {

                bat 'mvn clean test'
            }
        }
    }
}