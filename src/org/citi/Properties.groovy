package org.citi

def server() { return "SOMETHING.YANNI.com" }

def environment = {
    APP_NAME = "java-pet-docker"
    SOURCE_CONTEXT_DIR = ""
    JENKINS_TAG = "latest"
    UBER_JAR_CONTEXT_DIR = "target/"
    PROTOBIN_CONTEXT_DIR = "target/protobin/"
    UBER_JAR_FILE="target/spring-petclinic-2.2.0.BUILD-SNAPSHOT.jar"
    OCP_API_SERVER = "${OPENSHIFT_API_URL}"
    OCP_TOKEN = readFile('/var/run/secrets/kubernetes.io/serviceaccount/token').trim()
    APPLIER_SKIP_TAGS = "bitbucket-jenkins-webhook"
    APPLIER_TARGET = "app"
    ARTIFACTORY_DEV_REPO = "dev-images.jfrog.io"
    DEV_REPO_KEY = "dev-images"
    ARTIFACTORY_SECRET_NAME = "${CI_CD_NAMESPACE}-artifactory-access-token"
    SERVER = "SOMETHING YANNI"
}

return this