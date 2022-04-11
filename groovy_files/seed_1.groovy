job("seed_1") {
    definition {
        cpsScm {
            scm {
                git("https://github.com/CarlosBarroso/seed_jobs.git")
            }
            scriptPath("jenkinsfiles/seed_1.jenkinsfile")
        }
    }
}
