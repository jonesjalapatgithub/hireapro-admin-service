pipeline {
    agent any
    environment {
        IMAGE_REPO = "jonesjalapatgithub"
        NAME = "hireapro-admin-service"
        VERSION = "${env.BUILD_ID}-${env.GIT_COMMIT}"
        registryCredential = 'dockerhub_id'
    }
    stages {
    //     stage('Build') { 
    //         steps {
    //             echo "Running ${VERSION} on ${env.JENKINS_URL}"
    //             sh 'mvn -B -DskipTests clean package' 
    //         }
    //     }
    //     stage('Test') {
    //         steps {
    //             sh "chmod +x -R ${env.WORKSPACE}"
    //             sh 'mvn test'
    //         }
    //         post {
    //             always {
    //                 junit 'target/surefire-reports/*.xml'
    //             }
    //         }
    //     }
    //     stage('Docker Push') { 
    //         steps {
    //         echo " Branch ${env.BRANCH_NAME}"
    //         sh "docker login -u=${DOCKER_USERNAME} -p=${DOCKER_PASSWORD}"
    //         sh "docker build -t ${NAME} ."
    //         sh "docker tag ${NAME}:latest ${IMAGE_REPO}/${NAME}:latest"
    //         sh "docker push ${IMAGE_REPO}/${NAME}:latest"
    //         }
    //     }
        stage('Deploy') { 
            steps {
                sh "aws cloudformation create-stack --capabilities CAPABILITY_NAMED_IAM --stack-name hireapro-admin --template-body file://./ecs.yml"
            }
        }
    }
}
