pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'JDK_8'
    }
    stages {

        stage ('Build') {
            steps {
                echo 'Build'
                sh("mvn clean install") 
            }
        }
    }
}