echo 'INFO: Begin jenkins-build-genivi-swm-poc.groovy'

node('master') {
  def gitUrl = 'git://git.projects.genivi.org/genivi_swm.git'
  def gitBranch = 'master'
  
  git url: gitUrl, branch: gitBranch
  
  sh "id"
  sh "hostname"
  sh "df -h"
  // sh "sudo -i"                // sudo: no tty present and no askpass program specified
  
  // sh "sudo ./start_swm.sh"    // sudo: not found
  sh "/bin/bash -xe start_swm.sh"
}

echo 'INFO: End jenkins-build-genivi-swm-poc.groovy'
