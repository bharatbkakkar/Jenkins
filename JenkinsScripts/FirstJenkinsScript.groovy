pipeline {
    agent any
ansiColor('xterm') {
    stages {
        stage('Get Installed Packages') {
            steps 
            {
                sh '''
                    set +x
                    cd ~
		    cd "/var/lib/jenkins/workspace/HAEA Operations/InfraAuto-Git"
		    pwd
                    echo "Run ansible playbooks"
                    echo "Run as user:"
                    whoami
                    ansible-playbook "./Ansible/FirstAnisible.yml" -i "./Hosts/host.yml"
				'''
            }
        }
        stage('Install or Update ELK') {
            steps 
            {
                sh '''
                    set +x
                    cd ~
				'''
            }
        }
    }
    }
}
