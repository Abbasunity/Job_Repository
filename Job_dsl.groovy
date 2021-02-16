job{'NodeJS example'} {

scm {
	
		git('https://github.com/Abbasunity/FormValidationJankins') { node ->
			node / gitConfigName('DSL User')
			node / gitConfigEmail('abbas14uit@gmail.com')
			
			}
		}
	triggers {
	SCM('H/5 * * * *')
	}
	
	wrappers {
			
			nodejs('nodejs')
	}
	
	steps{
		shell("npm install")
		}
}