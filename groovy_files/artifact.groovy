pipelineJob("DownloadArtifact") {
    definition {
        description('Download Artifact')
        parameters {
          stringParam('URL', 'HEAD', 'Commit to build')
          stringParam('OUTPUT_FILE', 'output.zip', 'Commit to build')
        }

        cpsScm {
            lightweight(false)
            scm {
                github("CarlosBarroso/seed_jobs", "main")
                 
            }
            scriptPath("jenkinsfiles/artifact.jenkinsfile")
        }
    }
}
