def call(String my_image, String tag) {
    echo "building docker image" 
    sh "docker build -t $my_image:$tag ."
}