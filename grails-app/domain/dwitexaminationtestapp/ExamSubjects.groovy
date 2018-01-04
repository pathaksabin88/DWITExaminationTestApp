package dwitexaminationtestapp

class ExamSubjects {
    Exam exam
    String subjectName
    String sampleURL
    String examPaperDocument
    Date dateCreated



    static constraints = {
        examPaperDocument(maxSize:5000)
    }

}
