package org.citi

class Properties implements Serializable {

    def server() { return "SOMETHING.YANNI.com" }

    def environment() {

        return {
            APP_NAME = "java-pet-docker"
            MY_SERVER = properties2.server()
            myMap = test()
        }
    }
}