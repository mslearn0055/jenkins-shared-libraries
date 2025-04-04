def call() {
    script {
        echo "Running npm install..."
        sh '''
            export PATH=$PATH:/var/lib/jenkins/tools/jenkins.plugins.nodejs.tools.NodeJSInstallation/nodejs/bin
            if ! npm -v &> /dev/null
            then
                echo "❌ npm is missing. Please check Jenkins Node.js tool settings."
                exit 1
            fi
            npm install
        '''
    }
}
