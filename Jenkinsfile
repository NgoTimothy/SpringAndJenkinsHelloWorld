#!/usr/bin/env groovy
node {
    stage('Build') {
        sh './gradlew build'
    }
    stage('Test') {
        sh './gradlew clean test'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}