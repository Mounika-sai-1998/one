
pipeline {
    agent any 
    stages {
        stage(checkOutcode) {
            steps {
                checkOutCode()
            }
        }
        stage(mavenBuild) {
            steps {
                mavenBuild()
            }
        }
        stage(dockerBuild) {
            steps {
                script {
                    def my_image = "mounikaaarepu/shared-jenkins"
                    def tag = "${env.BUILD_NUMBER}"
                    dockerBuild(my_image, tag)
                }
            }
        }
        stage(dockerPush) {
            steps {
                script {
                    def my_image = "mounikaaarepu/shared-jenkins"
                    def tag = "${env.BUILD_NUMBER}"
                    dockerPush(my_image, tag)
                }
            }   
        }
    }
}