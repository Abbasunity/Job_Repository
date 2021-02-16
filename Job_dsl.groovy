
job('Job001') {
    scm {
        git('https://github.com/Abbasunity/FormValidationJankins.git')
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        batchFile('npm install')
    }
    steps {
        batchFile('npm run ng build')
    }
}
