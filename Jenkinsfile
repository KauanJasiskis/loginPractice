pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                script {
                    echo 'Cleaning the project...'
                    sh 'mvn clean'
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    echo 'Packaging the project, skipping tests...'
                    sh 'mvn package -DskipTests'
                }
            }
        }
    }
}
