def owner = 'vlnrajesh'
def project = 'jenkins-seeds'
def branchName = 'main'
def jobName = "${project}-${branchName}".replaceAll('/','-')
  job(jobName) {
    scm {
        git {
            remote {
              github("${owner}/${project}")
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
