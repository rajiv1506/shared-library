package my_playground.example

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def printDate() {
        steps.echo "Current date: ${new Date()}"
    }

    def cloneRepo(String repoUrl, String branch = 'main') {
        steps.sh "git clone -b ${branch} ${repoUrl}"
        steps.sh "cd terraform && cat main.tf"
    }
}
