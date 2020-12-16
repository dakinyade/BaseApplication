def gv

pipeline {
    agent any
    environment{
    NEW_VERSION = '1.3.0'
    //SERVER_CREDENTIALS= credentials('fe9dbba0-1d43-4bc6-a276-0a23054590f5')   
    }
    stages {
        stage("init"){
            steps {
                script {
                gv = load "script.groovy"
                }
            }
            
        }
        
        stage("build") {
             when {
                expression {
                  BRANCH_NAME == 'master'
                }
            }
            steps {
               //using groovey scripts 
                script{
                        gv.buildApp();
                        }
    
            }
        }
        stage("test") {
            when {
                expression {
                  BRANCH_NAME == 'master' 
                }
            }
            steps {
                echo 'testing the application'
            }
        }
        stage("deploy") {
            steps {
                echo 'deploying the application'
               // echo "deploying with ${SERVER_CREDENTIALS}"
                //sh "${SERVER_CREDENTIALS}"
            }
        }
}
   // post{
    //    always{
        //
      //  }
        //success{
        
        //}
        
       // failure{
        
        //}
    //}
}
