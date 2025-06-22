package my_playground.example

class Utilities implements Serializable {
    def steps

    Utilities(steps) {
        this.steps = steps
    }

    def printDate() {
        steps.echo "Current date: ${new Date()}"
    }
}
