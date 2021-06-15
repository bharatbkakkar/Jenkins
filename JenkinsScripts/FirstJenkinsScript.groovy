pipeline {
    agent any

    stages {
        stage('Get Installed Packages') {
            steps 
            {
                sh '''
                    set +x
                    cd ~
		    pwd
                    #cd /var/lib/jenkins/workspace/HAEA Operations/InfraAuto-Git/Ansible/TestFirst.yml
                    echo "Run ansible playbooks"
                    echo "Run as user:"
                    whoami
                    ansible-playbook "./HAEA Operations/InfraAuto-Git/Ansible/FirstAnisible.yml"
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
