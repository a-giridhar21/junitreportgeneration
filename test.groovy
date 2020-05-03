
pipeline {
   options 
   {
       timestamps()
   
   }
	agent any
	stages {
		stage("My first stage") {
			steps {
                echo "this is my first tsage"
            }
        }
        stage("Maven Version check") {
            steps {
                bat label: '', script: 'mvn -version'
            }
        }
    }
}