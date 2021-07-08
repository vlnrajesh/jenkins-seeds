def owner = 'vlnrajesh'
def project = 'jenkins-seeds'
def branchName = 'master'
def jobName = "${project}-${branchName}".replaceAll('/','-')
  job(jobName) {
    scm {
        git {
            remote {
              gitlab("${owner}/${project}")
            }
            branch("${branchName}")
        }
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell('ls -l')
    }
  }
}