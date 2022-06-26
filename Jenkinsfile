pipeline{
    agent any
    tools{
        maven 'MAVEN_HOME'
    }
    stages{
        stage("Build Maven"){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Joseph24x7/JavaEight']]])
                bat 'mvn clean install'
            }
        }
        stage("Build Docker Image"){
            steps{
                script{
                    bat 'docker build -t joseph24x7/java-eight-concepts .'
                }
            }
        }
        stage("Push image to hub"){
            steps{
                script{
                
	                withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpass')]) {
					    bat 'docker login -u joseph24x7 -p ${dockerhubpass}'
					}
	                bat 'docker push joseph24x7/java-eight-concepts'
                }
            }
        }
    }
}