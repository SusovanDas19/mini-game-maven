pipeline {
  agent { label 'slave' }

  tools {
    jdk 'jdk-21'
    maven 'Maven3'
  }

  stages {

    stage('Checkout') {
      steps {
        git 'https://github.com/SusovanDas19/mini-game-maven.git'
      }
    }

    stage('Build') {
      steps {
        bat 'mvn clean package'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts artifacts: 'target/*.jar'
      }
    }

  }
}
