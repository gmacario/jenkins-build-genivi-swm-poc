// jenkins-build-genivi-swm-poc/Jenkinsfile
//
// Assumption: The following parameters are defined in the Jenkins project configuration:
//
// def gitUrl = 'git://git.projects.genivi.org/genivi_swm.git'
// def gitBranch = 'master'

echo 'INFO: Begin Jenkinsfile'

// TODO: We should probably allocate this job to a particular node (!master)
node {
  
  git url: gitUrl, branch: gitBranch
  
  sh 'id'
  sh 'hostname'
  sh 'df -h'
  sh 'pwd'
  sh 'ls -la'

  // sh "sudo ./start_swm.sh"    // sudo: not found
  sh 'echo TODO: ./start_swm.sh'
}

echo 'INFO: End Jenkinsfile'
