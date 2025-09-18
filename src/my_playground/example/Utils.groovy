package my_playground.example

import java.text.SimpleDateFormat

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def printDate() {
        def dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        def date = new Date()
        steps.echo "Current Date and Time: ${dateFormat.format(date)}"
    }

    def cloneRepo(String repoUrl, String branch = 'main') {
        steps.sh "git clone -b ${branch} ${repoUrl}"
        steps.sh "cd terraform && cat main.tf"
    }

    def anotherclone(String repoUrl, String branch = 'main') {
        steps.git url: repoUrl, branch: branch
        steps.sh "cd terraform && cat variables.tf"
    }
}
