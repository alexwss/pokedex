pipeline {
    agent any
    tools {
        maven 'maven'
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