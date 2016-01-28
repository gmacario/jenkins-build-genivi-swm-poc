// jenkins-build-genivi-swm-poc/Jenkinsfile

echo 'INFO: Begin Jenkinsfile'

echo 'TODO: Jenkinsfile'

// TODO: We should probably allocate this job to a particular node (!master)
node {
  // def gitUrl = 'git://git.projects.genivi.org/genivi_swm.git'
  // def gitBranch = 'master'
  
  git url: gitUrl, branch: gitBranch
  
  sh "id"
  sh "hostname"
  sh "df -h"
  // sh "sudo -i"                // sudo: no tty present and no askpass program specified
  
  // sh "sudo ./start_swm.sh"    // sudo: not found
  sh "./start_swm.sh"
}

echo 'INFO: End Jenkinsfile'
