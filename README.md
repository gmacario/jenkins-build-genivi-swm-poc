# build-genivi-swm-poc

## Prerequisites

* [easy-jenkins](https://github.com/gmacario/easy-jenkins) installed

## Instructions

* Browse `http://${DOCKER_MACHINE_IP}:9080/`, click **New Item**
  - Item name: `build-genivi-swm-poc`
  - Type: **Pipeline**

  then click **OK**

* Inside the project configuration page, fill-in the following information:
  - Pipeline
    - Definition: Pipeline script from SCM
    - SCM: Git
      - Repositories
        - Repository URL: `https://github.com/gmacario/jenkins-build-genivi-swm-poc.git`

  then click **Save**

* Browse `http://${DOCKER_MACHINE_IP}:9080/job/build-genivi-swm-poc/build?delay=0sec` to trigger a build

**FIXME**: Build error - see <http://139.181.213.96:9080/job/build-genivi-swm-poc/1/console>:

```
TODO
```
