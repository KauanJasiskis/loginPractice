pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                script {
                    echo 'Cleaning the project...'
                    bat 'mvn clean'
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    echo 'Packaging the project, skipping tests...'
                    bat 'mvn package -DskipTests'
                }
            }
        }
    }
}
