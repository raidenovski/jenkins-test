pipeline {
    agent { docker {
      image 'maven:3-alpine'
      } }
    stages {
        stage('test') {
          steps {
            sh 'mvn -f **/pom.xml clean test'
           junit '**/target/*.xml'
          }
        }
        stage('build') {
          steps {
            sh 'mvn -f **/pom.xml install'
          }
        }
    }
}
