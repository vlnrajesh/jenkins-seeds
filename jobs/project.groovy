def owner = 'vlnrajesh'
def project = 'jenkins-seeds'
def branchName = 'main'
def scmRepo='github.com'
def jobName = "${scmRepo}${project}-${branchName}".replaceAll('/','-')
  folder(scmRepo) {
    displayName(titleCase(scmrepo))
    description('Projects created from titleCase(scmRepo))
  }
  job(jobName) {
    scm {
        git {
            remote {
              url("git@${scmRepo}:${owner}/${project}")
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
