pipeline {
    agent any

    stages {
        stage('Get Installed Packages') {
            steps 
            {
                sh '''
                    set +x
                    cd ~
                    cd /var/lib/jenkins/workspace/ansible
                    echo "Run ansible playbooks"
                    echo "Run as user:"
                    whoami
                    ansible-playbook "./ansible/TestFirst.yml"
				'''
            }
	stage('Update or Install ELK') {
            steps 
            {
            }
        }
    }
}
