public class Grades {
    private int size;
    private int[] grades;

    public Grades() {
        this.grades = new int[10];


    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        int i = this.size++;
    }
}