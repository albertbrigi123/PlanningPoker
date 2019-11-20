package com.example.admin;

public interface AddQuestionDialogListener {
    void applyQuestion(String question, String difficulty);

    void applyQuestionModification(String question, String difficulty, int pos);
}
