job("seed_1") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }

    steps {
        shell "echo seed job"
    }
}
