pipeline {
    agent { docker {
      image 'maven:3-alpine'
      } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'echo "Hello World!!!!!!!!!!!!!!!!!!"'
            }
        }
        stage('test') {
          steps {
            sh 'mvn clean test'
          }
        }
    }
}
