job("seed_1") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote {
                url  "https://github.com/CarlosBarroso/seed_jobs.git",
                branch "origin/master"
            }
            extensions {
                wipeOutWorkspace()
                localBranch master
            }
        }
    }
    steps {
        shell "echo seed job"
    }
}
