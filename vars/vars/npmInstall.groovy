def call() {
    script {
        echo "Running npm install..."
        sh '''
            if ! command -v npm &> /dev/null
            then
                echo "npm is not installed. Please install Node.js and npm."
                exit 1
            fi
            npm install
        '''
    }
}
