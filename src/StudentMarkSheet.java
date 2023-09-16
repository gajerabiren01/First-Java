public class StudentMarkSheet {

    int total;

  static StudentMarkSheet studentMarkSheet = new StudentMarkSheet();
    public static void  main(String[] args)
    {

        totalMarks(62,45,65);
        totalMarks(65,45,65);

    }

    static void totalMarks(int maths, int sci, int eng)
     {
        int total = maths + sci + eng;
        System.out.println("totalMarks of maths sci & eng" + " =" + total);
    }

    static void totalMarks01(int maths, int sci, int eng)
    {
        int total = maths + sci + eng;

        System.out.println("totalMarks of maths sci & eng" + " =" + total);
    }
}
