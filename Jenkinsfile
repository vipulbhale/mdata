pipeline {
    agent any

    tools { 
        maven 'maven_3.3.9' 
    }
    stages {
        stage ('Initialize') {
            steps {
                git([url: 'https://github.com/vipubhale/mdata', branch: 'AddingTesting'])
                //def mvnHome = tool 'maven_3.3.9'
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

        stage ('Build') {

            steps {
                echo 'This is build phase.'
                sh "mvn clean compile"
            }
        }

        stage ('Test') {

            steps {
                echo 'This is test phase.'
                sh "${M2_HOME}/bin/mvn -Dtest=aug.manas.mtconnect.mdata.unit.UTestMDataService test"
                sh "${M2_HOME}/bin/mvn -Dtest=aug.manas.mtconnect.mdata.itest.ITestMDataController test"
            }
        }


        stage ('Package') {

            steps {
                echo 'This is test phase.'
                sh "${M2_HOME}/bin/mvn clean package"
            }
        }
    }
}

