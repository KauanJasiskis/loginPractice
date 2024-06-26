pipeline {
    agent any
    tools {
        maven "maven-3.9.8"
    }
    stages {
        stage("Maven clean") {
            when {
                branch "main"
            }
            steps {
                sh "mvn clean"
            }
        }
        stage("Maven build") {
            when {
                branch "main"
            }
            steps {
                sh "mvn package -DskipTests"
            }
        }
    }
}
