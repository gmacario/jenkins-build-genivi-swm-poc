echo 'INFO: Begin build-genivi-swm-poc.groovy'

stage 'build'
    node('master') {
      def gitUrl = 'git://git.projects.genivi.org/genivi_swm.git'
      def gitBranch = 'master'
      
      git url: gitUrl, branch: gitBranch
      
      sh 'id'
      sh 'hostname'
      sh 'df -h'
      sh 'pwd'
      sh 'ls -la'
    
      stage 'unitTest'
      // sh 'sudo ./start_swm.sh'    // sudo: not found
      sh 'echo TODO: /bin/bash -xe start_swm.sh'
    }

stage 'systemTest'
    echo 'Nothing to test so far'

echo 'INFO: End build-genivi-swm-poc.groovy'
