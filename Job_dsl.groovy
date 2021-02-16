
job('FARMVALIDATION JOB001') {
    scm {
        git('https://github.com/Abbasunity/FormValidationJankins.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        shell('npm install')
    }
    steps {
        shell('npm run ng build')
    }
}
