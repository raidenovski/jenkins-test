pipeline {
    agent any
    stages {
        stage('test') {
          steps {
            sh 'mvn -f **/pom.xml clean test'
          }
        }
        stage('build') {
          steps {
            sh 'mvn -f **/pom.xml install'
          }
        }
    }
}
