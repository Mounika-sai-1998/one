def call() {
    echo "Building the project using maven"
    sh "mvn clean install"
}