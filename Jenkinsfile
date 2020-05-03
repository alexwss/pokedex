pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'JDK_8'
    }
    stages {
        stage ('Initialize') {
            steps {
<<<<<<< HEAD
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
=======
                echo 'Hello world!'
                sh 'mvn clean install -DskipTests'
>>>>>>> 90593b08b0e4724178ba90d1c2698202bf494557
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}