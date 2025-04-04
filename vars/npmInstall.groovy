def call() {
    script {
        echo "Running npm install..."
        sh '''
            if ! command -v npm &> /dev/null
            then
                echo "❌ npm is missing. Please install Node.js manually."
                exit 1
            fi
            npm install
        '''
    }
}
