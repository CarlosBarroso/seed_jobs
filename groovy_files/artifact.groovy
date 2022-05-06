pipelineJob("DownloadArtifact") {
    definition {
        description('Download Artifact')
        parameters {
          stringParam('URL', 'HEAD', 'Commit to build')
        }

        cpsScm {
            lightweight(false)
            scm {
                github("CarlosBarroso/seed_jobs", "main")
                 
            }
            scriptPath("jenkinsfilesartifact.jenkinsfile")
        }
    }
}
