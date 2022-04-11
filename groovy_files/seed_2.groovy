job("seed_2") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }

    steps {
        shell "echo seed job"
    }
}
