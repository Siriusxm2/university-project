package com.jpaTEST.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.control.Label;

public class emailValidator {
  private static final String regex =
      "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?!-)(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

  public void validateEmail(String email, boolean valid, Label lbl){
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    if(matcher.matches()) {
      valid = true;
    }
    else {
      valid = false;
      lbl.setText("Email has invalid characters");
    }
  }

}
