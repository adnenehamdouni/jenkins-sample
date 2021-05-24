pipeline {
        agent any
        tools {
                //jdk 'jdk8'
                maven 'maven 3.8.1'
        }
        stages {
            stage('test maven installation') {
                steps {
                    sh 'mvn -version'
                    sh 'which mvn'
                }
            }

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
