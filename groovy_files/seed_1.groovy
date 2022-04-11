job("seed_1") {
    description "Builds MyProject from master branch."
    
    logRotator(-1, 15, 1, -1)
    
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }

    steps {
      shell('echo Hello World!')
    }
}
