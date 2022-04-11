job("seed_1") {
    description "Builds MyProject from master branch."
    
    logRotator(-1, 15, 1, -1)
    
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {             
                        url('https://github.com/CarlosBarroso/seed_jobs.git')
                    }
                    branch('*/main')           
                }
            }
            lightweight()
            //scriptPath('jenkinsfiles/seed_1.jenkinsfile')
        }
    }
}
