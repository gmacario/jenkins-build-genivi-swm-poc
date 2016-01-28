// build-genivi-swm-poc/Jenkinsfile

echo 'INFO: Begin Jenkinsfile'

echo 'TODO: Jenkinsfile'

/** node {
  git url: 'https://github.com/jglick/simple-maven-project-with-tests.git'
  def mvnHome = tool 'M3'
  sh "${mvnHome}/bin/mvn -B verify"
} **/

node {
  // TODO: Make sure that this job is allocated to a particular node (!master)
  git url: 'git://git.projects.genivi.org/genivi_swm.git'
  
  sh "id"
  sh "hostname"
  sh "df -h"
  // sh "sudo -i"                // sudo: no tty present and no askpass program specified
  
  // sh "sudo ./start_swm.sh"    // sudo: not found
  sh "./start_swm.sh"
}

echo 'INFO: End Jenkinsfile'