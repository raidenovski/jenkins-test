pipeline {
    agent { docker {
      image 'maven:3-alpine'
//      args '-u root'
      } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'echo "Hello World!!!!!!!!!!!!!!!!!!"'
            }
        }
    }
}
