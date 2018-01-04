package dwitexaminationtestapp

class Exam {
    Date examDate
    String Batch
    String Semester
    enum Term{
        MidTerm,
        FinalTerm
    }

    Term term


    static constraints = {
    }
}
