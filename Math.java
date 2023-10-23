class Math{
    static double average(double... score) {
        double grade = 0;
        for (double num : score) {
            grade += num;
        }
        return grade / score.length;
    }
}