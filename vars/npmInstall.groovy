def call() {
    script {
        echo "Running npm install..."
        sh '''
            if ! command -v npm &> /dev/null
            then
                echo "npm is not installed. Installing Node.js and npm..."
                curl -fsSL https://deb.nodesource.com/setup_18.x | bash -
                sudo apt-get install -y nodejs
            fi
            npm install
        '''
    }
}
