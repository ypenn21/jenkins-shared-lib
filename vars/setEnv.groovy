def call() {
    env.APP_NAME = "spring_pet_clinic"
    env.TAG = "latest"
    env.YANNI = "YANNI"

    echo "env.APP_NAME set to: ${env.APP_NAME}"
    echo "env.TAG set to: ${env.TAG}"
}