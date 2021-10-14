pipeline {
    agent any
    environment {

    PATH = "C:\\WINDOWS\\SYSTEM32"

}
    stages {
        stage('Cleaning Stage') {
            steps {
                bat 'mvn clean test package'
            }
        }
        stage('Testing Stage') {
            steps {
                bat "mvn test"
            }
        }
        stage('Packaging Stage') {
            steps {
                bat "mvn package"
            }
        }
        stage('SonarQube Stage') {
            steps {
                bat "mvn sonar:sonar"
            }
        }
    }
}
