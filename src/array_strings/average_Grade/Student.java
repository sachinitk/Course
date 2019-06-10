package array_strings.average_Grade;
//kar to rakha hai
public class Student {
    private int id;
    private String name;
    private  int[] marks;
   private float average;
  private   char grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    void calculateAvg(){
        float sum  =0;
        for(int i = 0 ; i< marks.length; i++){
            sum+= marks[i];

        }
        float av = sum/marks.length;
        setAverage(av);

    }
    void findGrade(){
        if(getAverage() >=80 && getAverage() <=100)
            setGrade('O');
        if(getAverage() >=50 && getAverage() <=79)
            setGrade('A');
        if(getAverage()<50)
            setGrade('F');
    }

}
