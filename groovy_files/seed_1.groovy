pipelineJob("seed_3") {
    definition {
        description('example seed_3')
        cpsScm {
            lightweight(false)
            scm {
                github("CarlosBarroso/seed_jobs", "main")
                 
            }
            scriptPath("jenkinsfiles/seed_1.jenkinsfile")
        }
    }
}
