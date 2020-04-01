package org.citi

class Properties implements Serializable {

    static def server() { return "SOMETHING.YANNI.com" }

    static def myGlobalVar = "We made it!!!!!!!"

    static def environment() {

        return {
            APP_NAME = "java-pet-docker"
            MY_SERVER = "yanni.com"
            myMap = "[:]"
        }
    }
}