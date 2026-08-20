def call(String my_image, String tag) {
    echo "push docker image to docker hub"
    withDockerRegistry([credentialsId: 'docker-hub']) {
        sh "docker push $my_image:$tag"
    }
}