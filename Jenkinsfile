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
                sh("mvn clean install -DskipTests") 
            }
        }
        
        stage ('Test') {
            steps {
                echo 'Build'
                sh("mvn test") 
            }
        }        
        
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', onlyIfSuccessful: true
        }
    }
}