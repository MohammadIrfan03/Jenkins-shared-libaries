def call(String imageName, String credentialsId) {
    withDockerRegistry(credentialsId: credentialsId) {
        sh "docker push ${imageName}"
    }
}
