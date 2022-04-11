pipelineJob("seed_3") {
    definition {
        cpsScm {
            lightweight(false)
            scm {
                github("CarlosBarroso/seed_jobs", "main")
                 
            }
            scriptPath("jenkinsfiles/seed_1.jenkinsfile")
        }
    }
}
