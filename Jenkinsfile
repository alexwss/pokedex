pipeline {

    agent any

    stages {

        stage ('Build') {
            steps {
                echo 'Build'
                sh("mvn clean install") 
            }
        }
        
    }
}