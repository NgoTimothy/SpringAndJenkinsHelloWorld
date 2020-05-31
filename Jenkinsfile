#!/usr/bin/env groovy
node {
    stage('Build') {
        sh './gradlew build'
    }
    stage('Test') {
        echo 'Testing....'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}