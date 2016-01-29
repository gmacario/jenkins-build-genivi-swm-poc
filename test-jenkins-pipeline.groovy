/*
References:

https://dzone.com/refcardz/continuous-delivery-with-jenkins-workflow
https://dzone.com/storage/assets/413450-rc218-cdw-jenkins-workflow.pdf
 */
 
echo 'Hello world'

node {
    git 'https://github.com/gmacario/jenkins-build-genivi-swm-poc.git'

    sh 'id'
    sh 'pwd'
    sh 'ls -la'
}

node {
    git 'git://git.projects.genivi.org/genivi_swm.git'
    
    sh 'id'
    sh 'pwd'
    sh 'ls -la'
    // sh 'ls -la start_swm.sh'
}

node('master') {
    sh 'id'
    sh 'pwd'
    sh 'ls -la'
    sh 'docker version'
}

// EOF
