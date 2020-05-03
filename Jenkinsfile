pipeline {
    agent any
    
    stages {
    
        stage('build') {
        
            steps {
                echo 'Hello world!'
                sh 'mvn clean install -DskipTests'
            }
            
        }

    }
}