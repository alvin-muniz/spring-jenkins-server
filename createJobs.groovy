pipelineJob('spring-jenkins-demo') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/alvin-muniz/spring-jenkins-demo.git'
                    }
                    branch 'main'
                }
            }
        }
//        cps {
//            script(readFileFromWorkspace('pipelineJob.groovy'))
//            sandbox()
//        }
    }
}
