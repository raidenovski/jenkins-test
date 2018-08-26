pipeline {
    agent { docker {
      image 'maven:3-alpine'
      } }
    stages {
        stage('test') {
          steps {
            sh 'mvn -f **/pom.xml clean test'
 //           sh 'make check || true'
           junit '**/target/surefire-reports/*.xml'
          }
        }
        stage('build') {
          steps {
            sh 'mvn -f **/pom.xml install'
          }
        }
    }
}
