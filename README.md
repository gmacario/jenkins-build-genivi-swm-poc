# jenkins-build-genivi-swm-poc

Instructions and Pipeline for building the [GENIVI Software Management PoC](http://git.projects.genivi.org/genivi_swm.git) using [Jenkins](https://jenkins-ci.org/).

## Prerequisites

* [easy-jenkins](https://github.com/gmacario/easy-jenkins) installed and running

## Instructions

* Browse `http://${DOCKER_MACHINE_IP}:9080/`, click **New Item**
  - Item name: `build-genivi-swm-poc`
  - Type: **Pipeline**

  then click **OK**

* Inside the project configuration page, fill-in the following information:
  - This build is parameterized: Yes
    - Add Parameter > Choice Parameter
      - Name: `gitUrl`
      - Choices:
      
        ```
        git://git.projects.genivi.org/genivi_swm.git
        https://github.com/magnusfeuer/genivi_software_management.git
        https://github.com/gmacario/genivi_swm.git
        ```
      - Description:
      
        ```
        Please select the URL of the git repository you want to build
        ```
    - Add Parameter > Choice Parameter
      - Name: `gitBranch`
      - Choices:
      
        ```
        master
        ```
      - Description:
      
        ```
        Please select the branch of the git repository you want to build
        ```
  - Pipeline
    - Definition: Pipeline script from SCM
    - SCM: Git
      - Repositories
        - Repository URL: `https://github.com/gmacario/jenkins-build-genivi-swm-poc.git`

  then click **Save**

* Browse `http://${DOCKER_MACHINE_IP}:9080/job/build-genivi-swm-poc/`, then click **Build with Parameters**
  - Select gitUrl, gitBranch, then click **Build**

**FIXME**: Build error - see <http://139.181.213.96:9080/job/build-genivi-swm-poc/1/console>:

```
TODO
```
