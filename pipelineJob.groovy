pipeline {
    agent any
    stages {
        stage('Build') {
            echo 'Build'
        }
        stage('Test') {
            steps {
                echo 'Test'
            }
        }
    }

}
