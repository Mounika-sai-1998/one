@library('devops-shared-libraries') _
pipeline {
    agent any 
    stages {
        stage('Checkout code') {
            steps {
                checkOutCode()
            }
        }
        stage('Maven Build') {
            steps {
                mavenBuild()
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    def my_image = "mounikaaarepu/shared-jenkins"
                    def tag = "${env.BUILD_NUMBER}"
                    dockerBuild(my_image, tag)
                }
            }
        }
        stage('Docker Push') {
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