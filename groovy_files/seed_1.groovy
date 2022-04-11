pipelineJob("seed_3") {
    definition {
        cpsScm {
            lightweight(false)
            scm {
                git("https://github.com/CarlosBarroso/seed_jobs.git", "main")
                 
            }
            scriptPath("jenkinsfiles/seed_1.jenkinsfile")
        }
    }
}
