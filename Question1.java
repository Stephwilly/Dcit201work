public class Question1 {
    public static void executeGradeReport(double score) {
    // Step 1: Validate the score
    if (!validateScore(score)) {
        System.out.println("Invalid Score");
        return; // stop execution
    }

    // Step 2: Calculate the letter grade
    char grade = calculateLetterGrade(score);

    // Step 3: Display the performance message
    displayPerformanceMessage(grade);
}
}
