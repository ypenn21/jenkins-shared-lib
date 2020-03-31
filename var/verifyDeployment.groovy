def call(String appName, String projectName ){
    openshift.withCluster () {
        echo "Verifying deployment with project " + projectName + " of app " + appName + " 10 second wait"
        sleep 10 // give the deployment a few seconds. Will never complete that fast
        openshift.withProject( projectName ){
            echo "Finding dc " + appName
            def latestDeploymentVersion = openshift.selector('dc', appName ).object().status.latestVersion
            echo "Latest version " + latestDeploymentVersion
            echo "Finding rc " + appName + "-" + latestDeploymentVersion
            def rc = openshift.selector('rc', "${appName}-${latestDeploymentVersion}")
            echo "Found rc " + rc.toString()
            // echo rc.toString()
            rc.untilEach(1){
                def rcMap = it.object()
                echo "Replica counts match " + rcMap.status.replicas.equals(rcMap.status.readyReplicas)
                return (rcMap.status.replicas.equals(rcMap.status.readyReplicas))
            }
        }
    }
    echo "Verification complete"
}
