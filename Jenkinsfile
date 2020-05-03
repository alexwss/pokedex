pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'JDK_8'
    }
    stages {
        stage ('Initialize') {
            steps {
                echo 'Initialize'
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                echo 'Build'
                sh("mvn clean install") 
            }
        }
    }
}