pipeline {
        agent any
stages {
        stage('Clean') {
        
            steps {
                echo 'Cleaning..'
                
            }
        }
        stage('Test') {
        
            steps {
                echo 'Testing..'
                sh 'mvn clean test'
                
            }
        }
        
        stage('Package') {
        
            steps {
                echo 'Packaging..'
                sh 'mvn clean package'
                
            }
        }
       
    }

}
