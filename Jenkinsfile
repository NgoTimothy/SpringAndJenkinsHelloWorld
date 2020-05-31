#!/usr/bin/env groovy
node {
    stage('Build') {
        gradlew 'build'
    }
    stage('Test') {
        echo 'Testing....'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}