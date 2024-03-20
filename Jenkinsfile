pipeline {
    agent any
    tools{
        maven 'maven'
    }
    environment{
        SCANNER_HOME= tool 'sonar-scanner'
        
    }
    

    stages {
        stage('Code Checkout') {
            steps {
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/kishoraswar22/spring-boot-hello-world.git'
            }
        }
         stage('Code Build') {
            steps {
                sh 'mvn package'
            }
        }
         stage('Test') {
            steps {
                withSonarQubeEnv('sonar') {
                   sh 'mvn clean test sonar:sonar -Dsonar.projectKey=Test_Project -Dsonar.projectName=Test_Project  -Dsonar.host.url=http://13.233.63.202:9000'
              }
            }
        }
         stage('Deploy') {
            steps {
                sh 'mvn deploy -s settings.xml'
            }
        }
         stage('Nexus Download') {
            steps {
                sh 'curl -u admin:admin@2024 http://3.110.178.90:8081/repository/devops_repo/com/logistic/logistic/1/logistic-1.jar'
            }
        }
    }
}
