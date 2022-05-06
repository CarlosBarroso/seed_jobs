job("seed_2") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }

    steps {
        def _branch = params.COMMIT
        shell "echo seed job ${_branch}"
    }
}
