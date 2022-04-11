pipelineJob("seed_3") {
    definition {
        cpsScm {
            remote {
                name('origin')
                url("https://github.com/CarlosBarroso/seed_jobs.git")
              }
              branch('master')
        }
        scriptPath("jenkinsfiles/seed_1.jenkinsfile")
    }
}
